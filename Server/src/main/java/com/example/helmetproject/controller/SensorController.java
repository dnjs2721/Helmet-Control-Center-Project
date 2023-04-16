package com.example.helmetproject.controller;

import com.example.helmetproject.dto.GpsSensor;
import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.dto.SosSensor;
import com.example.helmetproject.dto.WearingSensor;
import com.example.helmetproject.service.SensorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    /* 작업 완료 */
    /* 헬멧 착용 정보 데이터 입력 */
    @PostMapping("/wearing")
    public void wearingSensor(
            @RequestBody WearingSensor wearingSensor){
        sensorService.wearingSensor(wearingSensor);
    }

    /* 작업 완료 */
    /* 충격 센서 정보 데이터 입력 */
    @PostMapping("/shockSensor")
    public void shockSensor(
            @RequestBody ShockSensor shockSensor){
        sensorService.shockSensor(shockSensor);
    }

    /*GPS Sensor*/
    @PostMapping("/gps")
    public void gpsSensor(
            @RequestBody GpsSensor gpsSensor){
        sensorService.gpsSensor(gpsSensor);
    }

    /*Sos Sensor*/
    @PostMapping("/sos")
    public void sosSensor(
            @RequestBody SosSensor sosSensor){
        sensorService.sosSensor(sosSensor);
    }




}
