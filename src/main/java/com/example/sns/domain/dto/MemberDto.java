package com.example.sns.domain.dto;

import java.time.LocalDate;

public record MemberDto (
        Long id,
        String nickname,
        String email,
        LocalDate birthDate
){
}
