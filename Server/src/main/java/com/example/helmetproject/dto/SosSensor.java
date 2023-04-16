package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SosSensor {

    private String helmetId;
    private Integer SosCondition;
    private LocalDate date;
}
