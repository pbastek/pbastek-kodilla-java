package com.kodilla.patterns.strategy.social;

import lombok.NonNull;

public class User {

    private final String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setPublisherService(@NonNull SocialPublisher publisher) {
            this.publisher = publisher;
    }
}
