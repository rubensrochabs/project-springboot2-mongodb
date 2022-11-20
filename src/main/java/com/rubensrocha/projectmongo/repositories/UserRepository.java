package com.rubensrocha.projectmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rubensrocha.projectmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
