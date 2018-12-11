package com.example.demospring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demospring.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
