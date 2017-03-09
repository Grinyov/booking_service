package com.grinyov.config;

import com.grinyov.dao.BookingRepository;
import com.grinyov.model.HotelBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vgrinyov.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 120.5, 7));
        bookings.add(new HotelBooking("Sharm", 170.8, 5));
        bookings.add(new HotelBooking("International", 230.0, 3));

        bookingRepository.save(bookings);
    }
}
