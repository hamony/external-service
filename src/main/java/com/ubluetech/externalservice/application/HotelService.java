package com.ubluetech.externalservice.application;

import com.ubluetech.externalservice.domain.Hotel;
import com.ubluetech.externalservice.domain.SearchCriteria;

import reactor.core.publisher.Flux;

public interface HotelService {
    Flux<Hotel> searchHotels(SearchCriteria criteria);
}
