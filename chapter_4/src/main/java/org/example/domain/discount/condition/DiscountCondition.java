package org.example.domain.discount.condition;

import org.movie.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
