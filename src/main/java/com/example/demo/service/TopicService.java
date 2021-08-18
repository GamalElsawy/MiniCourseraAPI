package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Topic;
import com.example.demo.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	//private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java", "Java Course", "This is a java course")));
	
	public List<Topic> getAllTopics() {	
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().
		forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
		//topics.stream().filter(tpc -> tpc.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
