package com.spring.hotel;

import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurent implements Restaurent {

    private final Chef chef;

    public FrenchRestaurent(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("저녁식사를 프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
