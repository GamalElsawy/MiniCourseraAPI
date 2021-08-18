package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Lesson;

public interface LessonRepository extends CrudRepository<Lesson, String> {

}
