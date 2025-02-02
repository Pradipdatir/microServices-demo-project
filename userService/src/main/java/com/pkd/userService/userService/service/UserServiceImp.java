package com.pkd.userService.userService.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pkd.userService.userService.Repo.UserRepository;
import com.pkd.userService.userService.entity.Hotel;
import com.pkd.userService.userService.entity.Rating;
import com.pkd.userService.userService.entity.User;
import com.pkd.userService.userService.exeptions.ResourceNotFoundException;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private HotelService hotelService;

	@Autowired
	private RestTemplate restTemplate;

	private Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

	@Override
	public User SaveUser(User user) {
		// Save the user entity in the repository
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// Retrieve all users from the repository
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// Use findById to retrieve the user by ID or throw an exception
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with ID " + userId + " not found"));

		Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/rating/user/" + user.getUserId(),
				Rating[].class);
		logger.info("{} ", ratingsOfUser);
		List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();

		List<Rating> ratingList = ratings.stream().map(rating -> {
			Hotel hotel = hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
			// return the rating
			return rating;
		}).collect(Collectors.toList());
		return user;
	}
}
