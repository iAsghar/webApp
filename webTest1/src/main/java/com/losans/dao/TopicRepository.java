package com.losans.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.losans.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
