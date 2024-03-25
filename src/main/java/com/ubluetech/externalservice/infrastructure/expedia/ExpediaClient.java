package com.ubluetech.externalservice.infrastructure.expedia;

import com.ubluetech.externalservice.domain.Hotel;
import com.ubluetech.externalservice.domain.SearchCriteria;
import com.ubluetech.externalservice.infrastructure.BookingClient;
import com.ubluetech.externalservice.infrastructure.PagedResponse;

import reactor.core.publisher.Mono;

public class ExpediaClient implements BookingClient {

    @Override
    public Mono<PagedResponse<Hotel>> searchHotels(SearchCriteria searchCriteria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchHotels'");
    }

    @Override
    public Mono<PagedResponse<Hotel>> getAllHotels() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHotels'");
    }

}
