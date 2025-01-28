package com.example.hotel_service.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel_service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
