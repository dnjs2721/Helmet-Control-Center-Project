package com.example.helmetproject.controller;

import com.example.helmetproject.dto.Helmet;
import com.example.helmetproject.service.HelmetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelmetController {

    private final HelmetService helmetService;

    public HelmetController(HelmetService helmetService) {
        this.helmetService = helmetService;
    }

    @PostMapping("/helmet/registrationr")
    public Helmet infoInsert(@RequestBody Helmet helmet){
        helmetService.infoInsert(helmet);
        return helmet;
    }

    @GetMapping("/helmet")
    public List<Helmet> getHelmetData(){
        List<Helmet> helmets = null;
        helmets = helmetService.getHelmetData();
        return helmets;


    }
}
