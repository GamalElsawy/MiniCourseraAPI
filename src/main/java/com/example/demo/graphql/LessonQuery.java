package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class LessonQuery implements GraphQLQueryResolver {
    private final LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(){
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findAll().forEach(lessons::add);
        return lessons;
    }
}
