package com.springcourse.springcourse.service;

import java.util.List;

import com.springcourse.springcourse.entites.Course;
// for lose 

public interface CourseServise {
    
	 public List<Course> getCourses();
	 
	 public Course getCourse(long courseID);
	 
	 public Course addCourse(Course course);
	 
	 public Course updateCourse(Course course);
	 
	 public void deletedCourse(Long parseLong);
	 
}
