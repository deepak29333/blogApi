package com.deepak.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min=4,message="username must be minimum of 4 characters")
    private  String name;
    @Email(message="Email Address id not Valid ")
    @NotEmpty
    private  String email;
    @NotEmpty
    private  String about;
    @NotEmpty
    @Size(min=3,max=10,message = "password must be min of 3 chars and max of 10 cahrs !!")
    private  String password;
}
