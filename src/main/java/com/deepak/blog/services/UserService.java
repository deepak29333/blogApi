package com.deepak.blog.services;

import com.deepak.blog.payloads.UserDto;

import java.util.List;
public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto,Integer userId);
    UserDto getUserBId(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userID);

}
