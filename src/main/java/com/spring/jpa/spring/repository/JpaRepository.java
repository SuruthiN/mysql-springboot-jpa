package com.spring.jpa.spring.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.spring.entity.JpaUser;


@Repository
public interface JpaRepository extends CrudRepository<JpaUser, UUID> {

}
