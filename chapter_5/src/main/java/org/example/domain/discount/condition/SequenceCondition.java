package org.example.domain.discount.condition;

import org.example.domain.Screening;

public class SequenceCondition {
    private int sequence;

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }
}
