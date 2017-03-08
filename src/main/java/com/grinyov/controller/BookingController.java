package com.grinyov.controller;

import com.grinyov.model.HotelBooking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vgrinyov.
 */
@RestController
@RequestMapping(value = "/booking")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController(){
        bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 120.5, 7));
        bookings.add(new HotelBooking("Sharm", 170.8, 5));
        bookings.add(new HotelBooking("International", 230.0, 3));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;
    }
    
}
