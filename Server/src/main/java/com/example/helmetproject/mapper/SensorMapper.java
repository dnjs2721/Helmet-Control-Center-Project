package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.GpsSensor;
import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.dto.SosSensor;
import com.example.helmetproject.dto.WearingSensor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SensorMapper {

    /* 착용 감지 센서 */
    void wearingSensor(WearingSensor wearingSensor);

    /* 충격 감지 센서 */
    void shockSensor(ShockSensor shockSensor);

    /* UserHelmetCondition Update */
    void userHelmetConditionUpdate(String wearingCondition,Integer userId);

    /*gps*/
    void gpsSensor(GpsSensor gpsSensor);

    void helmetUpdateGps(GpsSensor gpsSensor);

    /*sos*/
    void sosSensor(SosSensor sosSensor);

}
