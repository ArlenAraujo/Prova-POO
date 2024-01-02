package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.model.Key;

public interface KeyRepository extends JpaRepository<Key, Long> {

}
