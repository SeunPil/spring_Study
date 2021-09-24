package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

class MemberTest {

    //테스트 메서드 생성
    @Test
    void lomboktest() {
        Member member = new Member(1L, "김철수", Grade.VIP);
        member.getGrade();

        new Member();
        System.out.println(member);

        // 기본생성자
        // 모든 필드 초기화 생성자
        // setter / getter
        // hashcode / toString

    }

}