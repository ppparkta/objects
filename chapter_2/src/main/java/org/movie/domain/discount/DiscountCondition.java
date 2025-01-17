package org.movie.domain.discount;

import org.movie.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
