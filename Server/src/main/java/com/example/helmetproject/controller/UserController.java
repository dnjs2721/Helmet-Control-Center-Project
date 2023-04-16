package com.example.helmetproject.controller;

import com.example.helmetproject.dto.User;
import com.example.helmetproject.dto.UserWorkHistory;
import com.example.helmetproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity createUser(
            @RequestBody User user){
        try {
            log.info(user.toString());
            userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("create OK");
        } catch (NullPointerException nullPointerException) {
            return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body(nullPointerException);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> findUser(
            @PathVariable("userId") Integer userId){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findUser(userId));
    }

    @GetMapping("/user/findAll")
    public ResponseEntity<List<User>> findAll(){
        List<User> data = userService.findAll();
        log.info(data.toString());
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    @PostMapping("/user/work")
    public ResponseEntity userWork(@RequestBody UserWorkHistory userWorkHistory){
        userService.userWork(userWorkHistory);
        return ResponseEntity.status(HttpStatus.OK).body("Ok");
    }



}
