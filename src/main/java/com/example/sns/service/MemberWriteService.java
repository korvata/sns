package com.example.sns.service;

import com.example.sns.domain.dto.RegisterMember;
import com.example.sns.domain.entity.Member;
import com.example.sns.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberWriteService {

    final private MemberRepository memberRepository;

    public MemberWriteService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원정보등록
    public RegisterMember addMember(RegisterMember registerMember) {
        Member member = Member.builder()
                .nickName(registerMember.nickName())
                .email(registerMember.email())
                .birthDate(registerMember.birthDate())
                .build();

        memberRepository.save(member);

        return registerMember;
    }
}
