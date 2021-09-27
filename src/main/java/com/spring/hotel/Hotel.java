package com.spring.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록한다.
@Component
public class Hotel {

    private final Restaurent restaurent;

    //자동 주입 설정
    @Autowired
    public Hotel(@Qualifier("cr") Restaurent restaurent) {
        this.restaurent = restaurent;
    }

    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurent.orderDinner();
    }
}
