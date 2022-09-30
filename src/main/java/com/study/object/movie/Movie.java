package com.study.object.movie;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runnginTime;
    private Money fee;
    private DefaultDiscountPolicy defaultDiscountPolicy;

    public Movie(String title, Duration runnginTime, Money fee, DefaultDiscountPolicy defaultDiscountPolicy) {
        this.title = title;
        this.runnginTime = runnginTime;
        this.fee = fee;
        this.defaultDiscountPolicy = defaultDiscountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(defaultDiscountPolicy.calculateDiscountAmount(screening));
    }
}
