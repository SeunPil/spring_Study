package com.spring.core.oop.discount;

import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

/**
 * 정률 할인 정책 구현 클래스
 * 책임: VIP회원에게 정해진 비율만큼의 할인액을 적용해준다.
 */
public class RateDiscountPolicy implements DiscountPolicy {

    private static final double DISCOUNT_RATE = 0.2; // 20%할인

    @Override
    public int discount(Member member, int itemPrice) {
        if( member.getGrade() == Grade.VIP) {
            // int * double은 double이기 때문에 int로 캐스팅 해준다.
            return (int) (itemPrice * DISCOUNT_RATE);
        } else return 0;
    }
}
