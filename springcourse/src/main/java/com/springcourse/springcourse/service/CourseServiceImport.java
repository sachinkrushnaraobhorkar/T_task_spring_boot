package com.springcourse.springcourse.service;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcourse.springcourse.dao.CourseDao;
import com.springcourse.springcourse.entites.Course;

@Service
public class CourseServiceImport implements CourseServise{

	@Autowired
	private CourseDao courseDao;
	
	 List<Course> list;
	 
	 public CourseServiceImport() {
//		 
//		 list=new ArrayList<>();
//		 list.add(new Course(101,"JAVA","Basic JAVA"));
//		 list.add(new Course(102,"SQL","Basic SQL"));
		 }
//********************************************************************
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseID) {
		
		//Course c = null;
//		
//		for(Course course : list) {
//			
//			if(course.getId()== courseID) { 
//				 c=course;
//				 break;
//			}
//		}
	 return courseDao.getById(courseID);
	}
//************************************************************************
	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}
//***************************************************************************
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		    list.forEach(e -> {
//		    	if(e.getId() == course.getId())
//		    	{
//		    		e.setTitle(course.getTitle());
//		    		e.setDiscrption(course.getDiscrption());
//		    	}
//		    });
		courseDao.save(course);
		return course;
	}
//******************************************************************
	@Override
	public void deletedCourse(Long parseLong) {
		// TODO Auto-generated method stub
		// list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}
	
	


}
