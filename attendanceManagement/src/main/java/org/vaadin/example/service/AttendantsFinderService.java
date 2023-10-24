package org.vaadin.example.service;

import jdk.jfr.RecordingState;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.vaadin.example.data.出勤者リスト;

import java.time.LocalDate;

@Service
public class AttendantsFinderService {

    @Value("${eagle.api.uri.bringAttendants}")
    private String uri;

    public 出勤者リスト find(LocalDate date, Long placeId){
        RestTemplate restTemplate = new RestTemplate();
        RequestBody requestBody = new RequestBody(date, placeId);

        uri = "http://localhost:8081/eagle-api/bringAttendants";
        return restTemplate.postForObject(uri, requestBody,出勤者リスト.class);
    }

    record RequestBody(
            LocalDate date,
            Long placeId
    ){
    }

}
