package org.example.domain;

import java.time.Duration;
import org.example.domain.discount.condition.DiscountCondition;

public class AmountDiscountMovie extends Movie {
    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee, Money discountAmount,
                               DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    Money calculateDiscountAmount() {
        return discountAmount;
    }
}
