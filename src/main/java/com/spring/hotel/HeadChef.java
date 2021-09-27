package com.spring.hotel;

import org.springframework.stereotype.Component;

@Component
public class HeadChef implements Chef {

    @Override
    public void cook() {
        System.out.println("선임 주방장이 요리합니다.");
    }
}
