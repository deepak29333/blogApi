package com.deepak.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class UserDto {
    private int id;
    private  String name;
    private  String email;
    private  String about;
    private  String password;
}
