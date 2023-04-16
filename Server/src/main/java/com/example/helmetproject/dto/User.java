package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    /* 노동자 식별 번호 */
    private Integer userId;

    /* 노동자 이름 */
    private String userName;

    /* 노동자 주민등록 번호 */
    private String userSsn;

    /* 노동자 생년월일 */
    private LocalDate userBirth;

    /* 노동자 핸드폰 번호 */
    private String userPhoneNumber;

    /* 노동자 혈액형 */
    private String userBloodType;

    /* 노동자 근무 위치 */
    private String userWorkLocation;

    /* 노동자 사용 헬멧 */
    private String userWorkCondition;

    /* 노동자 헬멧 착용 여부 */
    private String userHelmetCondition;

}
