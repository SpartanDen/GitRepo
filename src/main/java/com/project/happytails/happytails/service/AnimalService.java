package com.project.happytails.happytails.service;

import com.project.happytails.happytails.domain.Animal;
import com.project.happytails.happytails.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal reportAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public List<Animal> getAnimalsByType(String type) {
        return animalRepository.findByType(type);
    }

    public List<Animal> getAnimalsByReporter(String username) {
        return animalRepository.findByReporterUsername(username);
    }
}
