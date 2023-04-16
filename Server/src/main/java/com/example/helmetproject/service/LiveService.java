package com.example.helmetproject.service;

import com.example.helmetproject.dto.LiveData;
import com.example.helmetproject.mapper.LiveMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveService {

    private final LiveMapper liveMapper;

    public LiveService(LiveMapper liveMapper) {
        this.liveMapper = liveMapper;
    }

    public List<LiveData> getAllData(){
        return liveMapper.getAllData();
    }
}
