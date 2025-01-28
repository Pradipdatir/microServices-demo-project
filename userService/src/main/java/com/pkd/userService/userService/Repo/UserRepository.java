package com.pkd.userService.userService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkd.userService.userService.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

}
