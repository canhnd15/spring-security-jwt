package com.davidnguyen.springsecurityjwt.service;

import com.davidnguyen.springsecurityjwt.dtos.ApiResponseDto;
import com.davidnguyen.springsecurityjwt.dtos.SignInRequestDto;
import com.davidnguyen.springsecurityjwt.dtos.SignUpRequestDto;
import com.davidnguyen.springsecurityjwt.exceptions.RoleNotFoundException;
import com.davidnguyen.springsecurityjwt.exceptions.UserAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUp(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;
    ResponseEntity<ApiResponseDto<?>> signIn(SignInRequestDto signInRequestDto);
}
