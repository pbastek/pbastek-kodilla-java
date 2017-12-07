package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;
import lombok.Getter;

@Getter
@Component
public class ForumUser {

    private String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }
}
