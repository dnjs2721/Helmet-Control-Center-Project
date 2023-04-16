package com.example.helmetproject.service;

import com.example.helmetproject.dto.User;
import com.example.helmetproject.dto.UserWorkHistory;
import com.example.helmetproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /* 노동자 등록 */
    public void createUser(User user){
        userMapper.createUser(user);
    }

    /* 특정 노동자 조회 */
    public User findUser(Integer userId){
        return userMapper.findUser(userId);
    }

    /* 노동자 모두 조회 */
    public List<User> findAll(){
        return userMapper.findAll();
    }

    /* 노동자 출근 등록 */
    public UserWorkHistory userWork(UserWorkHistory userWorkHistory){
        return userMapper.userWork(userWorkHistory);
    }
}
