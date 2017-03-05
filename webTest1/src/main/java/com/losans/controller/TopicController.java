package com.losans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.losans.domain.Topic;
import com.losans.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return service.getAllTopics();
	}
	
	/*@RequestMapping("/topic/{name}")
	public Topic getAllTopics(@PathVariable String name){
		return service.getTopic(name);
	}*/

	@RequestMapping(method=RequestMethod.POST, value="topics")
	public String saveTopic(@RequestBody Topic topic){
		service.add(topic);
		return "added successfully";
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="topics/{id}")
	public String saveTopic(@RequestBody Topic topic, @PathVariable int id){
		service.update(topic, id);
		return "updated  successfully";
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="topics/{id}")
	public String saveTopic( @PathVariable int id){
		service.delete(id);
		return "deleted  successfully";
	}
}
