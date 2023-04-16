package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.WorkUserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkMapper {

    void inputWorker(WorkUserDto workUserDto);

    List<WorkUserDto> getWorker();

    void helmetInputConditionUpdate(Integer userId,String helmetId);

    void userInputConditionUpdate(String helmetId, Integer userId);

    void userDeleteConditionUpdate();

    void helmetDeleteConditionUpdate();

    void deleteWorker(Integer userId);
}
