package org.example.domain.discount.condition;

import org.example.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
