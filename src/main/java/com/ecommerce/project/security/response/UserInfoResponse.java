package com.ecommerce.project.security.response;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private Long id;
    private String jwtToken;

    private String username;
    private List<String> roles;

    public UserInfoResponse(Long id, String username, String jwtToken, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
        this.jwtToken = jwtToken;
    }

    public UserInfoResponse(Long id, String username, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}
