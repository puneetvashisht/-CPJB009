package com.example.demospring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospring.entities.Course;

@RestController
@CrossOrigin
public class CourseController {
	
	
//	List<Course> courses = new ArrayList<Course>();
//	
//	{
//		Course course1 = new Course("Angular", "Framework from Google!!");
//		Course course2 = new Course("React", "Library from Facebook!!");
//		courses.add(course1);
//		courses.add(course2);
//	}
	
	@Autowired
	CourseRepo courseRepo;
	
	@RequestMapping("/courses")
	public List<Course> fetchAllCourses(){
		return courseRepo.findAll();
//		return courses;
	}
	
	@RequestMapping(path="/courses",method=RequestMethod.POST)
	public ResponseEntity<Void> addCourse(@RequestBody Course course){
//		courses.add(course);
		courseRepo.save(course);
		return new ResponseEntity(HttpStatus.CREATED);
	}

}
