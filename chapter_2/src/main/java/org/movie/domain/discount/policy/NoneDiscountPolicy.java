package org.movie.domain.discount.policy;

import org.movie.domain.Money;
import org.movie.domain.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
