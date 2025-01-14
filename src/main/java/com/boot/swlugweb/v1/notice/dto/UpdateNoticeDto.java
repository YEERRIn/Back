
package com.boot.swlugweb.v1.notice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@Builder
public class UpdateNoticeDto {
    private Integer noticeId;
    private String title;
    private String content;
    private String imagePath;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updateAt;
    private String roleType;
    private Long id;
}

