package com.example.helmetproject.controller;

import com.example.helmetproject.dto.WorkUserDto;
import com.example.helmetproject.service.WorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class WorkController {

    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @PostMapping("/worker")
    public void inputWorker(@RequestBody WorkUserDto workUserDto){
        workService.inputWorker(workUserDto);
    }

    @GetMapping("/worker")
    public List<WorkUserDto> getWorker(){
        return workService.getWorker();
    }

    @GetMapping("/worker/delete/{userId}")
    public void workerDelete(@PathVariable("userId") Integer userId){
        log.info("Controller ------ " + userId);
        workService.deleteWorker(userId);
    }
}
