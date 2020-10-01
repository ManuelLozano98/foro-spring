package com.manuel.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manuel.forum.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

}
