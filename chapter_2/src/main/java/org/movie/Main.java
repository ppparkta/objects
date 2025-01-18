package org.movie;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import org.movie.domain.Money;
import org.movie.domain.Movie;
import org.movie.domain.discount.condition.PeriodCondition;
import org.movie.domain.discount.condition.SequenceCondition;
import org.movie.domain.discount.policy.AmountDiscountPolicy;
import org.movie.domain.discount.policy.NoneDiscountPolicy;
import org.movie.domain.discount.policy.PercentDiscountPolicy;

public class Main {
    public static void main(String[] args) {
        Movie avatar = new Movie("아바타",
                Duration.ofHours(2),
                Money.wons(1000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59)
                        )));

        Movie titanic = new Movie("타이타닉",
                Duration.ofMinutes(160),
                Money.wons(180),
                new PercentDiscountPolicy(10.,
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59)
                        )));

        Movie starWars = new Movie("스타워즈",
                Duration.ofHours(2),
                Money.wons(500),
                new NoneDiscountPolicy());
    }
}