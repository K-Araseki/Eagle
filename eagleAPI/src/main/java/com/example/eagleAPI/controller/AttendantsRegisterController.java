package com.example.eagleAPI.controller;

import com.example.eagleAPI.service.AttendanceRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Slf4j
@RestController
public class AttendantsRegisterController {

    private AttendanceRegisterService attendanceRegisterService;

    public AttendantsRegisterController(AttendanceRegisterService attendanceRegisterService) {
        this.attendanceRegisterService = attendanceRegisterService;
    }

    @PostMapping(path = "/registerAttendants")
    public void insert(@RequestBody Request json){
        attendanceRegisterService.insert(
                json.accountId(),
                json.workingDay,
                json.startTime,
                json.endTime,
                json.duties(),
                json.insertTime,
                json.updateTime,
                json.deleteTime
        );
    }

    record Request(
            Long accountId,
            LocalDate workingDay,
            LocalDateTime startTime,
            LocalDateTime endTime,
            String duties,
            LocalDateTime insertTime,
            LocalDateTime updateTime,
            LocalDateTime deleteTime
    ) {
    }

}
