package com.example.demo.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService; 
	
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourse(@PathVariable("topicId") String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable("courseId") String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable("topicId") String topicId/*,
			@PathVariable("courseId") String courseId*/) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable("courseId") String id) {
		courseService.deleteCourse(id);
	}
	
}
