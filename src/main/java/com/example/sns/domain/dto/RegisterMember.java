package com.example.sns.domain.dto;

import java.time.LocalDate;

public record RegisterMember (
        Long id,
        String nickName,
        String email,
        LocalDate birthDate
){
}
