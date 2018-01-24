package com.kodilla.good.patterns.challenges.aircompany;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;

@EqualsAndHashCode
@ToString
@Getter
public class Flight {

    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String departureAirport;
    private String arrivalAirport;
    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Flight(String flightNumber, LocalDateTime departureTime, LocalDateTime arrivalTime, String departureAirport, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
}
