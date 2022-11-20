package com.rubensrocha.projectmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rubensrocha.projectmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
