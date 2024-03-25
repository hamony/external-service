package com.ubluetech.externalservice.application;

import com.ubluetech.externalservice.domain.BookingDetails;
import com.ubluetech.externalservice.domain.BookingRequest;
import com.ubluetech.externalservice.domain.BookingResponse;

public interface BookingService {
    public BookingResponse createBooking();
    public boolean updateBooking(int bookingId, BookingRequest request);
    public BookingDetails getBookingById(int bookingId);
    public boolean cancelBooking(int bookingId);
}
