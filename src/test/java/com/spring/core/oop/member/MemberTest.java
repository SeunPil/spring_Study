package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    //테스트 메서드 생성
    @Test
    void lomboktest() {
        Member member = new Member(1L, "김철수", Grade.VIP);
        member.getGrade();

        new Member();
        System.out.println(member);

    }

}