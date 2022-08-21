package jp.co.checkbord.demo.application.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserCommentReadDto {
    private final int id;
    private final String name;
    private final String mailAddress;
    private final LocalDateTime createdAt;
    private final String comment;
}
