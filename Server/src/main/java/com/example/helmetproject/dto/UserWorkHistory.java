package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserWorkHistory {
    private String userId;
    private String userName;
    private String userDepartment;
    private LocalDate userWorkDate;
}
