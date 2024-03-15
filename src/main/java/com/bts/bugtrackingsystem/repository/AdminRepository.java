package com.bts.bugtrackingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bts.bugtrackingsystem.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {


	Optional<Admin> findByName(String username);

}
