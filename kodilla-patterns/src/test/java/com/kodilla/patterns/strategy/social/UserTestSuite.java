package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void should_returnDefaultSharingStrategies() {
        //Given
        User a = new Millenials("Amanda");
        User b = new YGeneration("Sandra");
        User c = new ZGeneration("Anna");

        //When
        String aMessage = a.sharePost();
        String bMessage = b.sharePost();
        String cMessage = c.sharePost();

        //Then
        Assert.assertEquals("Message on Twitter", aMessage);
        Assert.assertEquals("Message on Facebook", bMessage);
        Assert.assertEquals("Message on Snapchat", cMessage);
    }

    @Test
    public void should_returnIndividualSharingStrategy() {
        //Given
        User a = new Millenials("Amanda");

        //When
        String beforeSet = a.sharePost();
        a.setPublisherService(new FacebookPublisher());
        String afterSet = a.sharePost();

        //Then
        Assert.assertEquals("Message on Twitter", beforeSet);
        Assert.assertEquals("Message on Facebook", afterSet);
    }
}
