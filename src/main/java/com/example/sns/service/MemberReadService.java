package com.example.sns.service;

import com.example.sns.domain.dto.MemberDto;
import com.example.sns.domain.entity.Member;
import com.example.sns.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberReadService {
    final private MemberRepository memberRepository;
    ModelMapper modelMapper = new ModelMapper();

    public MemberReadService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberDto getMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow();

        return modelMapper.map(member, MemberDto.class);
    }

}
