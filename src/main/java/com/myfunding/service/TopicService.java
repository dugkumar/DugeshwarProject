package com.myfunding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfunding.databasereository.TopicRepository;
import com.myfunding.domain.Topic;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> GetAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopics(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopics(Topic topic) {
		topicRepository.save(topic);

	}

	public void updatetopic(String id, Topic topic) {
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

}
