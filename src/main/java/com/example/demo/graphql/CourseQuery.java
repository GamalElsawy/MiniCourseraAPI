package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class CourseQuery implements GraphQLQueryResolver {
    private final CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
}
