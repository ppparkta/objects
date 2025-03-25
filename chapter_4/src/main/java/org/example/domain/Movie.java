package org.example.domain;

import java.time.Duration;
import java.util.List;
import org.example.domain.discount.condition.DiscountCondition;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;
}
