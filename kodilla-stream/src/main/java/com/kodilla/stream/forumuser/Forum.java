package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1,"userNo1", 'F',
                LocalDate.of(1993,12,31),130));
        forumUsers.add(new ForumUser(2, "userNo2", 'M',
                LocalDate.of(2005,2,28),45));
        forumUsers.add(new ForumUser(3, "userNo3", 'F',
                LocalDate.of(1974,4,30),0));
        forumUsers.add(new ForumUser(4, "userNo4", 'M',
                LocalDate.of(1944,7,15),17));
        forumUsers.add(new ForumUser(5, "userNo5", 'M',
                LocalDate.of(1997,9,30),250));
        forumUsers.add(new ForumUser(6, "userNo6", 'F',
                LocalDate.of(2003,9,3),0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
