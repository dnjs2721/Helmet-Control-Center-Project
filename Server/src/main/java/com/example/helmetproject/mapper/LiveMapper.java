package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.LiveData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LiveMapper {

    LiveData inputData(LiveData liveData);

    List<LiveData> getAllData();
}
