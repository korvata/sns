package com.example.sns.controller;

import com.example.sns.domain.dto.RegisterMember;
import com.example.sns.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    final private MemberWriteService memberWriteService;

    //회원가입
    @PostMapping("/members")
    public ResponseEntity<RegisterMember> register(@RequestBody RegisterMember registerMember) {
        return ResponseEntity.ok(memberWriteService.addMember(registerMember));
    }
}
