package com.study.object.movie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
