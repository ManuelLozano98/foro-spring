package com.manuel.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manuel.forum.model.ImagesTopic;

@Repository
public interface ImagesTopicRepository extends JpaRepository<ImagesTopic, Integer> {

}
