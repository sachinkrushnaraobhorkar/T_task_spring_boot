package com.springcourse.springcourse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcourse.springcourse.entites.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, Long>{

}
