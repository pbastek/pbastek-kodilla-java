package com.kodilla.testing.forum.statistics;

import lombok.Getter;

@Getter
public class ForumStatisticsCalculator {

    Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public ForumStatisticsCalculator(Statistics statistics) {

        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount == 0) {
            postsPerUser = 0;
            commentsPerUser = 0.0;
        } else {
            postsPerUser = (double)postsCount / (double)usersCount;
            commentsPerUser = (double)commentsCount / (double)usersCount;
        }
        if (postsCount == 0) {
            commentsPerPost = 0.0;
        } else {
            commentsPerPost = (double)commentsCount / (double)postsCount;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per single user: " + postsPerUser);
        System.out.println("Average number of comments per single user: " + commentsCount);
        System.out.println("Average number of comments per post: " + commentsPerPost);
    }
}