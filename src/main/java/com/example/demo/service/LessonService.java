package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessonRepository;

//import com.example.demo.course.CourseRepository;
//import com.example.demo.course.CourseService;

@Service
public class LessonService {

	@Autowired
	private LessonRepository lessonRepository;
	
	
	public List<Lesson> getAllLessons() {
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findAll().forEach(lessons::add);
		return lessons;
	}

	public Optional<Lesson> getLesson(String lessonId) {
		return lessonRepository.findById(lessonId);
	}
	
	public void addLesson(Lesson lesson, String courseId) {
		//lesson.setCourse(CourseService.courseRepository.findById(courseId).get());
		lessonRepository.save(lesson);
	}

	public void updateLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}

	public void deleteLesson(String lessonId) {
		lessonRepository.deleteById(lessonId);
	}

}
