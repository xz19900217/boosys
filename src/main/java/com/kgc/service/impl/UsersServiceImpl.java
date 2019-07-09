package com.kgc.service.impl;

import com.kgc.entity.Users;
import com.kgc.entity.UsersExample;
import com.kgc.mapper.UsersMapper;
import com.kgc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
@Autowired
private UsersMapper usersMapper;

    @Override
    public Users login(String username, String password) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<Users> users = usersMapper.selectByExample(example);
        if (null!=users&&users.size()>0){

            return  users.get(0);
        }

        return null;
    }

    @Override
    public boolean register(Users users) {


        return usersMapper.insertSelective(users)>0?true:false;
    }

    @Override
    public boolean exists(String username) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<Users> users = usersMapper.selectByExample(example);
        if (null!=users&&users.size()>0){
            return false;
        }
        return true;
    }


}
