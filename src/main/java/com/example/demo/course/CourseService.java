package com.example.demo.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java", "Java Course", "This is a java course")));
	
	public List<Course> getAllCourses(String topicId) {	
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).
		forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
		//topics.stream().filter(tpc -> tpc.getId().equals(id)).findFirst().get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
