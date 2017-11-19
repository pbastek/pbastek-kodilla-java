package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){

        System.out.println("Test Case: begin");
    }
    @After
    public void after(){

        System.out.println("Test Case: end");
    }

    @Test
    public void shouldHaveOddNumbersExterminatorEmptyList(){

        System.out.println("Empty list test.");

        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = exterminator.exterminate(emptyList);

        //Then
        Assert.assertEquals(emptyList,result);
    }
    @Test
    public void shouldHaveOddNumbersExterminatorNullList(){

        System.out.println("Null list testing");

        //Given
        ArrayList<Integer> nullList = null;
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = exterminator.exterminate(nullList);

        //Then
        Assert.assertEquals(emptyList,result);

        Assert.assertNotNull("Collection is empty",result);
        Assert.assertTrue("Collection is not empty",result.isEmpty());
    }
    @Test
    public void shouldHaveOddNumbersExterminatorNormalList () {

        System.out.println("Regular list testing");

        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> secondList = new ArrayList<Integer>(Arrays.asList(110, 111, 112, 113, 114, 115, 116, 117, 118));

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> evenList = exterminator.exterminate(list);
        ArrayList<Integer> evenSecondList = exterminator.exterminate(secondList);

        //Then
        Assert.assertEquals(evenList, new ArrayList<Integer>(Arrays.asList(0, 2, 4, 6, 8)));
        Assert.assertEquals(evenSecondList, new ArrayList<Integer>(Arrays.asList(110, 112, 114, 116, 118)));
    }
}
