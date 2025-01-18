package org.movie.domain.discount.policy;

import org.movie.domain.Money;
import org.movie.domain.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
