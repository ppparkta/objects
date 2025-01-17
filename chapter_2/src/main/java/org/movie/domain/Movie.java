package org.movie.domain;

import java.time.Duration;
import org.movie.domain.discount.DiscountPolicy;

public class Movie {
    private String title;
    private Duration runningTime;
    private DiscountPolicy discountPolicy;
    private Money fee;

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
