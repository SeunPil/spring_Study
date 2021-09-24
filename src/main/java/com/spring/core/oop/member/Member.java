package com.spring.core.oop.member;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor //모든 필드 초기화 생성자
@NoArgsConstructor //기본 생성자
@ToString
public class Member {

    private Long id; //회원 식별 코드
    private String name; //회원 이름
    private Grade grade; //회원 등급


}
