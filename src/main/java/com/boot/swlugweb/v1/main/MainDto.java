package com.boot.swlugweb.v1.main;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class MainDto {
    private String id;
    private Integer noticeId;
    private String title;
    private LocalDateTime createAt;
    private String userId;
}
