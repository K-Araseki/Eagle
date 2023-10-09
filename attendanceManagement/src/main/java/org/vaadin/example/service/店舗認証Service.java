package org.vaadin.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.vaadin.example.data.PlaceId;
import org.vaadin.example.data.PlaceName;
import org.vaadin.example.data.認証された店舗;

@Service
public class 店舗認証Service {
    // プロパティに記述
    @Value("")
    private String uri;

    public 認証された店舗 authenticate(int placeId, String placePassword){

        // apiが出来たら使う
//        RestTemplate restTemplate = new RestTemplate();
//        var builder = UriComponentsBuilder
//                .fromUriString(uri)
//                .queryParam("placeId", placeId)
//                .queryParam("placePassword", placePassword);
//        var 認証された店舗 = restTemplate.postForObject(uri,builder.build().getQueryParams(), 認証された店舗.class);
//        if (認証された店舗 == null){
//            return new 認証された店舗(new PlaceId(-1L),new PlaceName("-1"));
//        }

        // test用
        if (placePassword != "1pass"){
            return new 認証された店舗(new PlaceId(-1L),new PlaceName("-1"));
        }
        return new 認証された店舗(new PlaceId(1L), new PlaceName("千歳店"));

    }

    public 認証された店舗 authenticate_test(int placeId, String placePassword){

        if (placeId == 111 && placePassword == "1pass") {
            return new 認証された店舗(new PlaceId(1L), new PlaceName("千歳店"));
        }else {
            return new 認証された店舗(new PlaceId(-1L),new PlaceName("-1"));
        }
    }
}
