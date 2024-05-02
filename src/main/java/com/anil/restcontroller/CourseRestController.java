package com.anil.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.binding.Course;
import com.anil.service.CourserService;

@RestController
public class CourseRestController {

	@Autowired
	private CourserService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String>SaveCourse(@RequestBody Course c){
		String status = courseService.upsert(c);
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course>getCourseById(@PathVariable("cid") Integer cid){
		Course courseById = courseService.getCourseById(cid);
		return new ResponseEntity<Course>(courseById,HttpStatus.OK);
	}
}
