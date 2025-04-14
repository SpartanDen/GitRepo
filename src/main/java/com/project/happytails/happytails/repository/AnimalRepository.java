package com.project.happytails.happytails.repository;

import com.project.happytails.happytails.domain.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {
    List<Animal> findByType(String type);
    List<Animal> findByReporterUsername(String username);
}
