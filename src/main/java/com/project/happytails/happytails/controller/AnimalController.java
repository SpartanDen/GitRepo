package com.project.happytails.happytails.controller;

import com.project.happytails.happytails.domain.Animal;
import com.project.happytails.happytails.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
@CrossOrigin(origins = "*")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("/report")
    public Animal reportAnimal(@RequestBody Animal animal) {
        return animalService.reportAnimal(animal);
    }

    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/type/{type}")
    public List<Animal> getAnimalsByType(@PathVariable String type) {
        return animalService.getAnimalsByType(type);
    }

    @GetMapping("/reporter/{username}")
    public List<Animal> getAnimalsByReporter(@PathVariable String username) {
        return animalService.getAnimalsByReporter(username);
    }
}
