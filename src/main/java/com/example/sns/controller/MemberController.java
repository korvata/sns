package com.example.sns.controller;

import com.example.sns.domain.dto.RegisterMember;
import com.example.sns.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@RequiredArgsConstructor
@RestController
public class MemberController {

    final private MemberWriteService memberWriteService;

    //회원가입
    @PostMapping("/members")
    public void register(@RequestBody RegisterMember registerMember) {
        memberWriteService.addMember(registerMember);
    }
}
