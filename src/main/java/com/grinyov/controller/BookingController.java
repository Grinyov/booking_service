package com.grinyov.controller;

import com.google.common.collect.ImmutableList;
import com.grinyov.model.HotelBooking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

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

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookings.stream().filter(x -> x.getPricePerNight() <= price)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        bookings.add(hotelBooking);
        return bookings;
    }
}
