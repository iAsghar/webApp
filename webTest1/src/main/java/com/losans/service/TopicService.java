package com.losans.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.losans.dao.TopicRepository;
import com.losans.domain.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository dao;

	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		dao.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	/*public Topic getTopic(String name){
		return topics.stream().filter(t-> t.getName().equals(name)).findFirst().get();
	}*/

	public void add(Topic topic) {
		dao.save(topic);
	}	
	
	public void update(Topic topic, int id){
		
	}
	
	public void delete(int id){
		//topics.removeIf(t-> t.getId()==id);
	}
}
