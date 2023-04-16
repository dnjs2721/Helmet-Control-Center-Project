package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class WearingSensor {

    private String helmetId;

    /* 착용 1, 미착용 0 */
    private String wearingCondition;

    private LocalDate date;

}
