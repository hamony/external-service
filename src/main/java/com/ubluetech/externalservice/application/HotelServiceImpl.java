package com.ubluetech.externalservice.application;

import org.springframework.stereotype.Service;

import com.ubluetech.externalservice.domain.Hotel;
import com.ubluetech.externalservice.domain.SearchCriteria;
import com.ubluetech.externalservice.infrastructure.BookingClient;
import com.ubluetech.externalservice.infrastructure.PagedResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final BookingClient bookingClient;

    @Override
    public Flux<Hotel> searchHotels(SearchCriteria criteria) {
        return bookingClient.searchHotels(criteria)
                                .map(PagedResponse::getContent)
                                .flatMapMany(Flux::fromIterable);
    }
    
}
