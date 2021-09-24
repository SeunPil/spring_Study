package com.spring.core.oop.member;

//역할: 적당한 회원 저장소에 저장 명령을 내리는 책임
public class MemberService {

    // 필드로 가지고 있는 경우는 "협력관계"를 한다는 것이다.
    // 감독
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    //회원가입 명령 기능
    //배역(추상화)
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원조회 명령 기능
    //배우(구체화)
    private Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
