package com.pkd.ratting.service;

import java.util.List;

import com.pkd.ratting.entities.Rating;

public interface RatingService {
	
	public Rating saveRating(Rating rating);
	
	public List<Rating> getAllRating();

	public Rating getRating(String ratingId);
	
	public List<Rating> getRatingByHotelId(String hotel);
	
	public List<Rating> getRatingByUserId(String hotelId);
}
