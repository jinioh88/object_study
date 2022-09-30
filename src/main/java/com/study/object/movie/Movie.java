package com.study.object.movie;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runnginTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runnginTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runnginTime = runnginTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
