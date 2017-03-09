package com.grinyov.dao;

import com.grinyov.model.HotelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vgrinyov.
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long>{
}
