package com.example.sns.domain.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
public class Member {
    @Id
    final private Long id;
    private String nickName;
    final private String email;
    final private LocalDate birthDate;
    final private LocalDateTime createdAt;
    final private static Long NAME_MAX_LENGTH = 10L;

    @Builder
    public Member(Long id, String nickName, String email, LocalDate birthDate, LocalDateTime createdAt) {
        this.id = id;
        validateNickname(nickName);
        this.nickName = Objects.requireNonNull(email);
        this.email = Objects.requireNonNull(email);
        this.birthDate = Objects.requireNonNull(birthDate);
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
    }

    private void validateNickname(String nickname) {
        Assert.isTrue(nickname.length() <= NAME_MAX_LENGTH, "최대 길이를 초과했습니다.");
    }
}
