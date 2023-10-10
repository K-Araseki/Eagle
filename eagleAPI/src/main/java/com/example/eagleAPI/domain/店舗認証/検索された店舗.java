package com.example.eagleAPI.domain.店舗認証;

public record 検索された店舗(
        PlaceId placeId,
        PlaceName placeName,
        PlacePassword placePassword
) {
}
