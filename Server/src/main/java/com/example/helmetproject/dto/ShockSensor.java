package com.example.helmetproject.dto;

import lombok.Data;

@Data
public class ShockSensor {

    private String helmetId;
    private Integer shockDataLeft;
    private Integer shockDataRight;
    private Integer shockDataCenter;
    private Integer shockDataBack;
    private Integer shockDataFront;
}
