package com.authorization.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authorization.rest.model.TokenDto;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Custom services", description = "Custom endpoints")
public class UserController {

    public UserController() {}

    @PostMapping("/validate")
    public TokenDto validate(@RequestBody final TokenDto jwtToken) {
        // TO-DO: Decode the jwtToken claims to get the user and then return the NYX token from (user, NYX token)
        TokenDto nyxToken = new TokenDto();
        nyxToken.setToken("nyxtoken");
        return nyxToken;
    }
}
