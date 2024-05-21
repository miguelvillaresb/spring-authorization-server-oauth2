package com.authorization.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.server.authorization.OAuth2TokenIntrospection;
import org.springframework.security.oauth2.server.authorization.authentication.OAuth2TokenIntrospectionAuthenticationToken;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomIntrospectionResponseHandler implements AuthenticationSuccessHandler {

    public CustomIntrospectionResponseHandler() {}

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        OAuth2TokenIntrospectionAuthenticationToken token = (OAuth2TokenIntrospectionAuthenticationToken) authentication;
        OAuth2TokenIntrospection claims = token.getTokenClaims();
        Map<String, Object> claimsMap = claims.getClaims();

        Map<String, Object> filteredClaimsMap = new HashMap<>();
        filteredClaimsMap.put("active", claimsMap.get("active"));
        filteredClaimsMap.put("scope", claimsMap.get("scope"));
        filteredClaimsMap.put("client_id", claimsMap.get("client_id"));
        filteredClaimsMap.put("jti", claimsMap.get("jti"));
        filteredClaimsMap.put("token_type", claimsMap.get("token_type"));

        if (claims.isActive()) {
            // TO-DO: Here you have to include the NYX token as a new claim
            System.out.println("Getting NYX token for username " + claims.getSubject());
            String nyxToken = "harcodednyxtoken";
            filteredClaimsMap.put("nyx_token", nyxToken);
        }

        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        String jsonClaims = gson.toJson(filteredClaimsMap);
        writer.write(jsonClaims);
    }
}
