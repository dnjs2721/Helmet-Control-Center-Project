package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.User;
import com.example.helmetproject.dto.UserWorkHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void createUser(User user);

    User findUser(Integer userId);

    List<User> findAll();

    UserWorkHistory userWork(UserWorkHistory userWorkHistory);
}
