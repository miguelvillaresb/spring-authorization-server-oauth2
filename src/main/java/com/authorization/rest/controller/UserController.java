package com.authorization.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authorization.rest.model.CredentialsDto;
import com.authorization.rest.model.TokenDto;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/custom-auth")
@Tag(name = "Custom authentication", description = "Endpoints for custom authentication")
public class UserController {

    public UserController() {}

    @PostMapping("/login")
    public TokenDto login(@RequestBody final CredentialsDto credentialsDto) {
        TokenDto tokenDto = new TokenDto();
        tokenDto.setToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c");
        return tokenDto;
    }

    @PostMapping("/validate")
    public boolean validate(@RequestBody final TokenDto tokenDto) {
        return true;
    }
}
