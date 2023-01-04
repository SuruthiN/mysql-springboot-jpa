package com.spring.jpa.spring.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.spring.entity.JpaUser;
import com.spring.jpa.spring.service.JpaService;



@RestController
@RequestMapping("/user")
public class JpaController {

	@Autowired
	private JpaService jpaService;
	
	@PostMapping(value = "/create")
	public ResponseEntity<JpaUser> createUser(@RequestBody JpaUser user) {
		jpaService.saveUser(user);
		return ResponseEntity.ok(user);
	}
	@GetMapping(value="/get_all")
	public List<JpaUser> getAllUsers(){
		return jpaService.getAll();
		
	}

	@GetMapping(value = "/get/{id}")
	public JpaUser getByID(@PathVariable("id")UUID id) {
		Optional<JpaUser>userOptional= jpaService.getByID(id);
		return userOptional.get();
		
	}
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<JpaUser> DeleteUser( @PathVariable("id")UUID id) {
		jpaService.DeleteUser(id);
		return ResponseEntity.ok(null);
	}
	@PutMapping(value = "/update")
	public ResponseEntity<JpaUser> updateUser(@RequestBody JpaUser user) {
		jpaService.updateUser(user);
		return ResponseEntity.ok(user);
	}
	
	
	}
