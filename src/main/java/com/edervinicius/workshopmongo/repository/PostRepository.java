package com.edervinicius.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.edervinicius.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
