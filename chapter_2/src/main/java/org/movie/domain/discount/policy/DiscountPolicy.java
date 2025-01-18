package org.movie.domain.discount.policy;

import org.movie.domain.Money;
import org.movie.domain.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
