package com.myfunding.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myfunding.domain.Topic;
import com.myfunding.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;

	/* Get All data for topic */

	@RequestMapping("/topics")
	public List<Topic> GetAllTopic() {
		return topicservice.GetAllTopics();

	}

	/* Get data for particular topic id */

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {

		return topicservice.getTopics(id);
	}

	/* Save information in Topic */

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopics(topic);

	}

	/* update data for particulat topic id */

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updatetopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updatetopic(id, topic);
	}

	/*
	 * Delete particulat id
	 */

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {

		topicservice.deleteTopic(id);
	}

}
