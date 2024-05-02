package com.anil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.binding.Course;
import com.anil.reopository.CourseRepository;

@Service
public class CourseServiceImpl implements CourserService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course c) {
		// TODO Auto-generated method stub
		courseRepo.save(c);
		return "Success";
	}

	@Override
	public Course getCourseById(Integer cid) {
		// TODO Auto-generated method stub
		Optional<Course> findById = courseRepo.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		List<Course> findAll = courseRepo.findAll();
		return findAll;
	}

	@Override
	public String deletCourseById(Integer cid) {
		// TODO Auto-generated method stub
		boolean existsById = courseRepo.existsById(cid);
		if (existsById) {

			courseRepo.deleteById(cid);
			return "deleted successfully";
		}
		return "data not found";
	}

}
