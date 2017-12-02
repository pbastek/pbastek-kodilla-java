package com.kodilla.stream.portfolio;

import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class User {

    private final String username;
    private final String realName;

    public User(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

}
