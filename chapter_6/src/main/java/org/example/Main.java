package org.example;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        RecurringSchedule schedule = new RecurringSchedule("회의", DayOfWeek.THURSDAY,
                LocalTime.of(10, 30), Duration.ofMinutes(30));

        Event meeting1 = new Event("회의",
                LocalDateTime.of(2025, 4, 24, 10, 30, 0),
                Duration.ofMinutes(30));

        Event meeting2 = new Event("회의",
                LocalDateTime.of(2025, 4, 25, 10, 30, 0),
                Duration.ofMinutes(30));

        if (!meeting2.isSatisfied(schedule)) {
            meeting2.reschedule(schedule);
        }
    }
}