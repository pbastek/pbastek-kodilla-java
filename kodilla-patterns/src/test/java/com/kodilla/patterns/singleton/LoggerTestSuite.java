package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class LoggerTestSuite {

    @Test
    public void should_returnSimpleLog() {
        //Given
        String logMessage = "Simple log";
        //When
        Logger.getInstance().log(logMessage);
        //Then
        Assert.assertEquals(logMessage, Logger.getInstance().getLastLog());
    }

    @Test
    public void should_returnFewLogs() {
        //Given
        String logMessage = "Simple log";
        //When
        IntStream.range(0, 20).
                forEach(i -> Logger.getInstance().log(logMessage + i));
        //Then
        Assert.assertEquals(logMessage + "19", Logger.getInstance().getLastLog());
    }
}
