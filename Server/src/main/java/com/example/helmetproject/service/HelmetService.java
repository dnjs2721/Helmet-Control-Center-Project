package com.example.helmetproject.service;

import com.example.helmetproject.dto.Helmet;
import com.example.helmetproject.mapper.HelmetMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HelmetService {

    private final HelmetMapper helmetMapper;

    @Autowired
    public HelmetService(HelmetMapper helmetMapper) {
        this.helmetMapper = helmetMapper;
    }

    public void infoInsert(Helmet helmet){
        log.info(helmet.toString());
        helmetMapper.infoInsert(helmet);
    }

    public List<Helmet> getHelmetData(){
        return helmetMapper.getHelmetData();
    }
}
