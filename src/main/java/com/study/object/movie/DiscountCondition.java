package com.study.object.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
