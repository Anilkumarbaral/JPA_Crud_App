package com.anil.reopository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.binding.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>{
	

}
