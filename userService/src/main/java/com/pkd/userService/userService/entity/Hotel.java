package com.pkd.userService.userService.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hotel")

public class Hotel {

	@Id
	private String id = UUID.randomUUID().toString();
	private String location;
	private String ratting;
	private String about;
}
