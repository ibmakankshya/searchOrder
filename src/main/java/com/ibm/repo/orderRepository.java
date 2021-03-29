package com.ibm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.entity.order;




public interface orderRepository extends MongoRepository<order, String>{

}


