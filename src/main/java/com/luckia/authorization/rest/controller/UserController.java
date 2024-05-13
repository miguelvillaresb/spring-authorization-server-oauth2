package com.luckia.authorization.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.luckia.authorization.rest.model.CredentialsDto;
import com.luckia.authorization.rest.model.TokenDto;
import com.luckia.authorization.rest.model.CodeDto;

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
