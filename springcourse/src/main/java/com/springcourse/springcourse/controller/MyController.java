package com.springcourse.springcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.springcourse.entites.Course;
import com.springcourse.springcourse.service.CourseServise;

@RestController
public class MyController {
        
	@Autowired
	private CourseServise courseservice;
	
	
	
	//mapping for url postman
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	//Get the courses
	@GetMapping("/course")
	public List<Course>  getCourses(){
		
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getcourse(@PathVariable String courseID) {
		return this.courseservice.getCourse( Long.parseLong(courseID));
		
	}
	
	@PostMapping("/course")
	public Course addcourse(@RequestBody Course course ) {
		return this.courseservice.addCourse(course);
	}
	//Post and updated
	@PutMapping("/course")
	 public Course updateCourse(@RequestBody Course course) {
		 return this.courseservice.updateCourse(course);
	 }
	
	// DELETED public
	@DeleteMapping("course/{courseId}")
    public ResponseEntity<HttpStatus> deletedCourse(@PathVariable String courseId){
   	 try {
   		 this.courseservice.deletedCourse(Long.parseLong(courseId));
   		 return new ResponseEntity<>(HttpStatus.OK);
   	 }
   	 catch(Exception e){
   		 return new ResponseEntity<>(HttpStatus.OK);
   	 }
    }
	
} 







