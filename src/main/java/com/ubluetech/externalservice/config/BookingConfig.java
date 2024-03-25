package com.ubluetech.externalservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ubluetech.externalservice.infrastructure.BookingClient;
import com.ubluetech.externalservice.infrastructure.ClientManager;
import com.ubluetech.externalservice.infrastructure.expedia.ExpediaClient;
import com.ubluetech.externalservice.infrastructure.hotelbeds.HotelbedsClient;
import com.ubluetech.externalservice.infrastructure.hotelbeds.HotelbedsMapper;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BookingConfig {
    private final HotelbedsMapper hotelbedsMapper;
    private final ClientManager providerConnection;

    @Bean
    @ConditionalOnProperty(name = "booking.client", havingValue = "hotelbeds")
    public BookingClient hotelbedsClient() {
        return new HotelbedsClient(hotelbedsMapper, providerConnection);
    }

    @Bean
    @ConditionalOnProperty(name = "booking.client", havingValue = "expedia")
    public BookingClient expediaClient() {
        return new ExpediaClient();
    }
}
