package com.anil.service;

import java.util.List;

import com.anil.binding.Course;

public interface CourserService {
	
	public String upsert(Course c);
	
	public Course getCourseById(Integer cid);
	
	public List<Course>getAllCourse();
	
	public String deletCourseById(Integer cid);

}
