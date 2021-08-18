package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
