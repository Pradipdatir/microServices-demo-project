package com.pkd.userService.userService.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id")
	private String userId;

	@Column(name = "name", length = 20)
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "about")
	private String about;

	@Transient
	List<Rating> rating = new ArrayList<Rating>();

}
