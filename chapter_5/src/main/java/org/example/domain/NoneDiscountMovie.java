package org.example.domain;

import java.time.Duration;
import org.example.domain.discount.condition.DiscountCondition;

public class NoneDiscountMovie extends Movie {
    public NoneDiscountMovie(String title, Duration runningTime, Money fee,
                             DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
    }

    @Override
    Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
