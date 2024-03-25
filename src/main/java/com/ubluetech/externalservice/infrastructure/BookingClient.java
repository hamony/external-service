package com.ubluetech.externalservice.infrastructure;

import com.ubluetech.externalservice.domain.Hotel;
import com.ubluetech.externalservice.domain.SearchCriteria;

import reactor.core.publisher.Mono;

public interface BookingClient {
    public Mono<PagedResponse<Hotel>> searchHotels(SearchCriteria searchCriteria);
    public Mono<PagedResponse<Hotel>> getAllHotels();
}
