package com.example.helmetproject.controller;

import com.example.helmetproject.dto.LiveData;
import com.example.helmetproject.service.LiveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LiveController {

    private final LiveService liveService;

    public LiveController(LiveService liveService) {
        this.liveService = liveService;
    }

    @GetMapping("live")
    public List<LiveData> getAllData(){
        return liveService.getAllData();
    }
}
