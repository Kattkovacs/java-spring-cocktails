package com.codecool.cocktailsspring.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
        private String token;
        private String type = "Bearer";
        private Long id;
        private String name;
        private String email;
        private List<String> roles;

	public JwtResponse(String accessToken, Long id, String name, String email, List<String> roles) {
            this.token = accessToken;
            this.id = id;
            this.name = name;
            this.email = email;
            this.roles = roles;
	}

//    public void setAccessToken(String accessToken) {
//        this.token = accessToken;
//    }
//
//    public void setTokenType(String tokenType) {
//        this.type = tokenType;
//    }

}
