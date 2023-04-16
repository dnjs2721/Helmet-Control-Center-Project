package com.example.helmetproject.service;

import com.example.helmetproject.dto.*;
import com.example.helmetproject.mapper.HelmetMapper;
import com.example.helmetproject.mapper.LiveMapper;
import com.example.helmetproject.mapper.SensorMapper;
import com.example.helmetproject.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
public class SensorService {

    private final SensorMapper sensorMapper;
    private final HelmetMapper helmetMapper;
    private final UserMapper userMapper;
    private final LiveMapper liveMapper;
    LocalDate localDate = LocalDate.now();

    public SensorService(SensorMapper sensorMapper, HelmetMapper helmetMapper, UserMapper userMapper, LiveMapper liveMapper) {
        this.liveMapper = liveMapper;
        this.userMapper = userMapper;
        this.helmetMapper = helmetMapper;
        this.sensorMapper = sensorMapper;
    }

    public void shockSensor(ShockSensor shockSensor) {
        log.info(shockSensor.toString());
        LiveData liveData = new LiveData();

        // liveData Input
        if (shockSensor.getShockDataLeft() >= 600) {
            //helmetId 설정
            liveData.setHelmetId(shockSensor.getHelmetId());
            //helmetId 사용중인 user를 찾아서 userName 설정
            Helmet helmet = new Helmet();
            helmet = helmetMapper.getHelmetInfo(shockSensor.getHelmetId());
            User user = new User();
            user = userMapper.findUser(helmet.getHelmetCondition());
            //userName 설정
            liveData.setUserName(user.getUserName());
            liveData.setWorkLocation(user.getUserWorkLocation());
            //userHelmet 착용 여부 설정
            liveData.setWearingInfo(user.getUserHelmetCondition());
            //helmetGps 설정
            liveData.setLocationX(helmet.getHelmetLatitude());
            liveData.setLocationY(helmet.getHelmetLongitude());
            //충격설정
            liveData.setShockPosition("왼쪽");
            liveData.setShock(shockSensor.getShockDataLeft());
            log.info(liveData.toString());
            liveMapper.inputData(liveData);
        }

        if (shockSensor.getShockDataRight() >= 600) {

            //helmetId 설정
            liveData.setHelmetId(shockSensor.getHelmetId());
            //helmetId 사용중인 user를 찾아서 userName 설정
            Helmet helmet = new Helmet();
            helmet = helmetMapper.getHelmetInfo(shockSensor.getHelmetId());
            User user = new User();
            user = userMapper.findUser(helmet.getHelmetCondition());
            //userName 설정
            liveData.setUserName(user.getUserName());
            //userHelmet 착용 여부 설정
            liveData.setWearingInfo(user.getUserHelmetCondition());
            //helmetGps 설정
            liveData.setLocationX(helmet.getHelmetLatitude());
            liveData.setLocationY(helmet.getHelmetLongitude());
            //충격설정
            liveData.setShockPosition("오른쪽");
            liveData.setShock(shockSensor.getShockDataRight());

            liveMapper.inputData(liveData);
        }

        if (shockSensor.getShockDataBack() >= 600) {

            //helmetId 설정
            liveData.setHelmetId(shockSensor.getHelmetId());
            //helmetId 사용중인 user를 찾아서 userName 설정
            Helmet helmet = new Helmet();
            helmet = helmetMapper.getHelmetInfo(shockSensor.getHelmetId());
            User user = new User();
            user = userMapper.findUser(helmet.getHelmetCondition());
            //userName 설정
            liveData.setUserName(user.getUserName());
            //userHelmet 착용 여부 설정
            liveData.setWearingInfo(user.getUserHelmetCondition());
            //helmetGps 설정
            liveData.setLocationX(helmet.getHelmetLatitude());
            liveData.setLocationY(helmet.getHelmetLongitude());
            //충격설정
            liveData.setShockPosition("뒤쪽");
            liveData.setShock(shockSensor.getShockDataBack());

            liveMapper.inputData(liveData);
        }

        if (shockSensor.getShockDataFront() >= 600) {

            //helmetId 설정
            liveData.setHelmetId(shockSensor.getHelmetId());
            //helmetId 사용중인 user를 찾아서 userName 설정
            Helmet helmet = new Helmet();
            helmet = helmetMapper.getHelmetInfo(shockSensor.getHelmetId());
            User user = new User();
            user = userMapper.findUser(helmet.getHelmetCondition());
            //userName 설정
            liveData.setUserName(user.getUserName());
            //userHelmet 착용 여부 설정
            liveData.setWearingInfo(user.getUserHelmetCondition());
            //helmetGps 설정
            liveData.setLocationX(helmet.getHelmetLatitude());
            liveData.setLocationY(helmet.getHelmetLongitude());
            //충격설정
            liveData.setShockPosition("앞쪽");
            liveData.setShock(shockSensor.getShockDataFront());

            liveMapper.inputData(liveData);
        }

        if (shockSensor.getShockDataCenter() >= 600) {

            //helmetId 설정
            liveData.setHelmetId(shockSensor.getHelmetId());
            //helmetId 사용중인 user를 찾아서 userName 설정
            Helmet helmet = new Helmet();
            helmet = helmetMapper.getHelmetInfo(shockSensor.getHelmetId());
            User user = new User();
            user = userMapper.findUser(helmet.getHelmetCondition());
            //userName 설정
            liveData.setUserName(user.getUserName());
            //userHelmet 착용 여부 설정
            liveData.setWearingInfo(user.getUserHelmetCondition());
            //helmetGps 설정
            liveData.setLocationX(helmet.getHelmetLatitude());
            liveData.setLocationY(helmet.getHelmetLongitude());
            //충격설정
            liveData.setShockPosition("위쪽");
            liveData.setShock(shockSensor.getShockDataCenter());
            log.info(liveData.toString());
            liveMapper.inputData(liveData);
        }
        sensorMapper.shockSensor(shockSensor);
    }

    public void wearingSensor(WearingSensor wearingSensor) {
        wearingSensor.setDate(localDate);
        sensorMapper.wearingSensor(wearingSensor);
        Helmet helmet = helmetMapper.getHelmetInfo(wearingSensor.getHelmetId());
        sensorMapper.userHelmetConditionUpdate(wearingSensor.getWearingCondition(), helmet.getHelmetCondition());
        log.info(wearingSensor.toString());
    }

    public void gpsSensor(GpsSensor gpsSensor){
        gpsSensor.setDate(localDate);
        sensorMapper.helmetUpdateGps(gpsSensor);
        sensorMapper.gpsSensor(gpsSensor);
    }

    public void sosSensor(SosSensor sosSensor){
        sosSensor.setDate(localDate);
        sosSensor.setSosCondition(1);
        sensorMapper.sosSensor(sosSensor);
    }
}