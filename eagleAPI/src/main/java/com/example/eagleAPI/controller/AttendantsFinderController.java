package com.example.eagleAPI.controller;

import com.example.eagleAPI.domain.出勤確認.検索された出勤者リスト;
import com.example.eagleAPI.service.AttendantsFinderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Slf4j
@RestController
public class AttendantsFinderController {

    private AttendantsFinderService attendantsFinderService;

    public AttendantsFinderController(AttendantsFinderService attendantsFinderService) {
        this.attendantsFinderService = attendantsFinderService;
    }

    @PostMapping(path = "/bringAttendants")
    public 検索された出勤者リスト bringAttendants(@RequestBody Request json){
        log.debug("received" + json);
        検索された出勤者リスト 検索された出勤者リスト = attendantsFinderService.findBy(json.placeId(), json.date);
        return 検索された出勤者リスト;
    }

    record Request(
            Long placeId,
            LocalDate date
    ){
    }

}
