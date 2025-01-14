package com.boot.swlugweb.v1.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//사용자 이메일 받아올 DTO
public class EmailRequestDto {


    @Email //이메일이 맞는지 검증
    @NotEmpty (message = "이메일을 입력해주세요")
    private String email;
}
