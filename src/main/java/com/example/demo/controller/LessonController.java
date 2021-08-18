package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Lesson;
import com.example.demo.service.LessonService;
@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> getAllLessons() {
		return lessonService.getAllLessons();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public Optional<Lesson> getLesson(@PathVariable String lessonId) {
		return lessonService.getLesson(lessonId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
		lessonService.addLesson(lesson, courseId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public void updateLesson(@RequestBody Lesson lesson) {
		lessonService.updateLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public void deleteLesson(@PathVariable String lessonId) {
		lessonService.deleteLesson(lessonId);
	}
}
