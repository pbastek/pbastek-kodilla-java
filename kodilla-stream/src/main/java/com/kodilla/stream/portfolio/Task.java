package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class Task {

    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description, final User assignedUser, final User creator, final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

}
