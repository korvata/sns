package com.example.sns.controller;

import com.example.sns.domain.dto.MemberDto;
import com.example.sns.domain.dto.RegisterMember;
import com.example.sns.service.MemberReadService;
import com.example.sns.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberController {

    final private MemberWriteService memberWriteService;
    final private MemberReadService memberReadService;

    //회원가입
    @PostMapping("/members")
    public ResponseEntity<RegisterMember> register(@RequestBody RegisterMember registerMember) {
        return ResponseEntity.ok(memberWriteService.addMember(registerMember));
    }

    @GetMapping("/members/{id}")
    public ResponseEntity<MemberDto> getMember(@PathVariable Long id) {
        return ResponseEntity.ok(memberReadService.getMember(id));
    }
}
