package com.example.Task1.controller;

import com.example.Task1.Service.SupportService;
import com.example.Task1.dto.SupportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupportController {
    @Autowired
    private SupportService supportService;

    @PostMapping("/support")
    public void createSupportIssue(@RequestBody SupportDto supportDto) {
        supportService.createSupportEntity(supportDto);
    }
}
