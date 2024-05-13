package com.authorization.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authorization.rest.model.CodeDto;
import com.authorization.rest.model.CredentialsDto;
import com.authorization.rest.model.TokenDto;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for custom authentication")
public class UserController {

    public UserController() {}

    @PostMapping("/login")
    public void login(@RequestBody final CredentialsDto credentialsDto) {

    }

    @PostMapping("/validate")
    public void validate(@RequestBody final TokenDto tokenDto) {

    }

    @PostMapping("/token")
    public void token(@RequestBody final CodeDto codeDto) {

    }
}
