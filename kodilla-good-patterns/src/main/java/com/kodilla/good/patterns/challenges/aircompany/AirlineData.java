package com.kodilla.good.patterns.challenges.aircompany;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.ToString;
import lombok.Getter;

@ToString
@Getter
public class AirlineData {

    private String airlineName;
    private Set<Flight> flightMap = new HashSet<>();

    public AirlineData(String airlineName) {
        this.airlineName = airlineName;
        importFlightData();
    }

    public void importFlightData() {

        flightMap.add(new Flight("AC201",
                LocalDateTime.of(2017, 12, 11, 8, 0),
                LocalDateTime.of(2017, 12, 11, 11, 20),
                "Warsaw", "Berlin"));

        flightMap.add(new Flight("AR331",
                LocalDateTime.of(2017, 12, 28, 12, 0),
                LocalDateTime.of(2017, 12, 28, 13, 30),
                "Berlin", "Hamburg"));

        flightMap.add(new Flight("AP381",
                LocalDateTime.of(2017, 12, 28, 9, 10),
                LocalDateTime.of(2017, 12, 28, 12, 25),
                "Berlin", "Hamburg"));

        flightMap.add(new Flight("AC076",
                LocalDateTime.of(2017, 12, 11, 18, 12),
                LocalDateTime.of(2017, 12, 11, 20, 25),
                "Berlin", "Paris"));

        flightMap.add(new Flight("AR256",
                LocalDateTime.of(2017, 12, 13, 15, 40),
                LocalDateTime.of(2017, 12, 13, 17, 20),
                "Warsaw", "Budapest"));
        flightMap.add(new Flight("AC282",
                LocalDateTime.of(2017, 12, 14, 6, 10),
                LocalDateTime.of(2017, 12, 14, 7, 50),
                "Budapest", "Berlin"));

        flightMap.add(new Flight("AC999",
                LocalDateTime.of(2017, 12, 27, 20, 10),
                LocalDateTime.of(2017, 12, 27, 21, 50),
                "Warsaw", "Berlin"));
    }
}
