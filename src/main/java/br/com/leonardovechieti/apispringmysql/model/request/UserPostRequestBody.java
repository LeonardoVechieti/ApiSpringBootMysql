package br.com.leonardovechieti.apispringmysql.model.request;

import lombok.Data;

@Data
public class UserPostRequestBody {
    private String name;
    private String email;
    private String password;
}
