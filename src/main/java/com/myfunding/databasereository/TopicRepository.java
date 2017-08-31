package com.myfunding.databasereository;

import org.springframework.data.repository.CrudRepository;

import com.myfunding.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{
	

}
