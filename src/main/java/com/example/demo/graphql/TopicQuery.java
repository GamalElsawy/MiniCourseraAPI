package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Topic;
import com.example.demo.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TopicQuery implements GraphQLQueryResolver {
    private final TopicService topicService;

    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }
}
