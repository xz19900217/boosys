package com.kgc.service;

import com.kgc.entity.Users;

public interface UsersService {
    public Users login(String username,String password);
    public boolean register(Users users);
    public boolean exists(String username);


}
