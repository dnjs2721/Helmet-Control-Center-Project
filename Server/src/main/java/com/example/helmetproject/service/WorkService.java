package com.example.helmetproject.service;

import com.example.helmetproject.dto.WorkUserDto;
import com.example.helmetproject.mapper.WorkMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class WorkService {

    private WorkMapper workMapper;

    @Autowired
    public WorkService(WorkMapper workMapper) {
        this.workMapper = workMapper;
    }

    public void inputWorker(WorkUserDto workUserDto){
        workMapper.userInputConditionUpdate(workUserDto.getHelmetId(),workUserDto.getUserId());
        workMapper.helmetInputConditionUpdate(workUserDto.getUserId(), workUserDto.getHelmetId());
        workMapper.inputWorker(workUserDto);
    }

    public void deleteWorker(Integer userId){
        workMapper.helmetDeleteConditionUpdate();
        workMapper.userDeleteConditionUpdate();
        log.info("service ----- " + userId);
        workMapper.deleteWorker(userId);
    }

    public List<WorkUserDto> getWorker() {
        return workMapper.getWorker();
    }
}
