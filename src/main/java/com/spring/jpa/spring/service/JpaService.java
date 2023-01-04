package com.spring.jpa.spring.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.spring.jpa.spring.entity.JpaUser;
import com.spring.jpa.spring.repository.JpaRepository;


@Service
public class JpaService {
	
	@Autowired 
	private JpaRepository jpaRepository;

	public void saveUser(JpaUser user) {
		jpaRepository.save(user);	
		
	}

	/*
	 * public List<User> getAll(){ return (List<User>) JpaRepository.findAll(); }
	 */
//	public List<User> searchAllUsersByName(String name){
//		return JpaRepository.findAllByUserName(name);
//	}
//	
//	public Optional<User> getByID(UUID id){
//		return JpaRepository.findById(id);
//	}

	public List<JpaUser> getAll() {
		// TODO Auto-generated method stub
		return (List<JpaUser>) jpaRepository.findAll();
	}

	public Optional<JpaUser> getByID(UUID id) {
		// TODO Auto-generated method stub
		return jpaRepository.findById(id);
	}

	public void DeleteUser(UUID id) {
		// TODO Auto-generated method stub
		jpaRepository.deleteById(id);
	}

	public void updateUser(JpaUser user) {
		// TODO Auto-generated method stub
		jpaRepository.save(user);
	}

	

}
