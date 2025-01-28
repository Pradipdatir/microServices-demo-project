package com.example.hotel_service.service;

import java.util.List;

import com.example.hotel_service.entity.Hotel;

public interface HotelService {

	public Hotel saveHotel(Hotel hotel);

	public List<Hotel> getAllHotel();

	public Hotel getHotel(String hotelId);
}
