package org.movie.domain.discount.policy;

import org.movie.domain.Money;
import org.movie.domain.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;


    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
