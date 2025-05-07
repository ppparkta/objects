package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import org.example.phone.Call;
import org.example.phone.Money;
import org.example.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));
        phone.call(new Call(LocalDateTime.of(2025, 1, 1, 12, 10, 0),
                LocalDateTime.of(2025, 1, 1, 12, 11, 0)
        ));
        phone.call(new Call(
                LocalDateTime.of(2025, 1, 2, 12, 10, 0),
                LocalDateTime.of(2025, 1, 2, 12, 11, 0)
        ));
        phone.calculateFee();
    }
}