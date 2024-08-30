package com.collegedirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegedirectory.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
