package com.pkd.ratting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkd.ratting.entities.Rating;
import com.pkd.ratting.repo.RatingRepository;

@Service
public class RattingServiceImp implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating saveRating(Rating rating) {
		// TODO Auto-generated method stub
		Rating rating11 = ratingRepository.save(rating);
		return rating11;
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating getRating(String ratingId) {
		// TODO Auto-generated method stub
		Optional<Rating> optrating = ratingRepository.findById(ratingId);
		Rating rating = optrating.get();
		return rating;
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	};

}
