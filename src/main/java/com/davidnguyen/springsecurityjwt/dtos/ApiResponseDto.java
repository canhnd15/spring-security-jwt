package com.davidnguyen.springsecurityjwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ApiResponseDto<T> {
    private boolean isSuccess;
    private String message;
    private T response;
}
