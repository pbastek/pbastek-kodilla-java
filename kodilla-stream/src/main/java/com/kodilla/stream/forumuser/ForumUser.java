package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthDate, final int postsCount) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }
}
