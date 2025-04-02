package org.example.domain;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreend;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreend) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreend = whenScreend;
    }

    public Money calculateFee(int audienceCount) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                if (movie.isDiscountable(whenScreend, sequence)) {
                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                }
                break;
            case PERCENT_DISCOUNT:
                if (movie.isDiscountable(whenScreend, sequence)) {
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
        }
        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
