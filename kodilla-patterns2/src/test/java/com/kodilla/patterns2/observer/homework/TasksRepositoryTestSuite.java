package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TasksRepositoryTestSuite {

    @Test
    public void should_returnNotification() {
        //Given
        Student Harry = new Student("Harry");
        Student Tom = new Student("Tom");
        Student Sara = new Student("Sara");
        Student Lena = new Student("Lena");

        TasksRepository HarryRepository = new TasksRepository(Harry);
        TasksRepository TomsRepository = new TasksRepository(Tom);
        TasksRepository SarasRepository = new TasksRepository(Sara);
        TasksRepository LenasRepository = new TasksRepository(Lena);

        Mentor John = new Mentor("John");
        Mentor Jim = new Mentor("Jim");

        HarryRepository.registerObserver(John);
        TomsRepository.registerObserver(Jim);
        SarasRepository.registerObserver(John);
        LenasRepository.registerObserver(Jim);

        //When
        HarryRepository.addTask(new Task("Hibernate"));
        TomsRepository.addTask(new Task("Hibernate"));
        HarryRepository.addTask(new Task("Spring"));
        SarasRepository.addTask(new Task("Patterns"));
        LenasRepository.addTask(new Task("REST"));

        //Then
        Assert.assertEquals(3, (int) John.getTotalTasksToCheck());
        Assert.assertEquals(2, (int) Jim.getTotalTasksToCheck());

    }
}
