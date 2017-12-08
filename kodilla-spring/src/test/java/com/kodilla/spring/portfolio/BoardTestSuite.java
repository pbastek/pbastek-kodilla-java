package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void should_returnTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTaskDoneList("Task done");
        board.addTaskInProgressList("Task in progress");
        board.addTasktoDoList("Task to do");

        //Then
        Assert.assertEquals("Task done", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Task to do", board.getToDoList().getTasks().get(0));
    }
}