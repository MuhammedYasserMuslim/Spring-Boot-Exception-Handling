package com.spring.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
public class ErrorResponse {

    private boolean success;

    private String massage;


    private List<String> detail;

    private LocalDateTime dateTime;

    public ErrorResponse(String massage, List<String> detail) {
        this.massage = massage;
        this.detail = detail;
        this.success= Boolean.FALSE;
        this.dateTime=LocalDateTime.now();
    }
}
