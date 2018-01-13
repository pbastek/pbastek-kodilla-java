package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void should_returnConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void should_returnUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();

        //When
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void should_returnUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery =
                "select U.FIRSTNAME, U.LASTNAME " +
                        "from USERS U, POSTS P " +
                        "where U.ID = P.USER_ID " +
                        "group by U.LASTNAME, U.FIRSTNAME " +
                        "having count(*) >= 2 " +
                        "order by U.LASTNAME, U.FIRSTNAME;";
        Statement statement = dbManager.getConnection().createStatement();

        //When
        ResultSet result = statement.executeQuery(sqlQuery);

        //Then
        int resultsCount = 0;
        while (result.next()) {
            System.out.println("Firstname: " + result.getString(1) + ", " + "Lastname: " + result.getString(2));
            resultsCount++;
        }
        Assert.assertEquals(2, resultsCount);
    }
}
