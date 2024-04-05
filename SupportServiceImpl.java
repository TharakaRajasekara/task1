package com.example.Task1.Service.IMPL;

import com.example.Task1.Entity.SupportEntity;
import com.example.Task1.Repository.SupportRepository;
import com.example.Task1.Service.SupportService;
import com.example.Task1.dto.SupportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SupportServiceImpl implements SupportService {
    @Autowired
    private SupportRepository supportRepository;

    @Override
    public void createSupportEntity(SupportDto supportDto) {
        SupportEntity supportEntity = new SupportEntity();
        supportEntity.setDescription(supportDto.getDescription());
        supportEntity.setIssueType(supportDto.getIssueType());
        supportEntity.setCreatedAt(new Date());
        supportRepository.save(supportEntity);
    }
}
