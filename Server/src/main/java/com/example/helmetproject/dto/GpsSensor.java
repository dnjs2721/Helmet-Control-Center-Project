package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GpsSensor {

    private String helmetId;
    private Float latitude;
    private Float longitude;
    private LocalDate date;
}
