package com.example.petmanagementsystem;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class PetService {

    private final PetMapper petMapper;

    public PetService(PetMapper petMapper) {

        this.petMapper = petMapper;
    }

    public Pet findPet(int id) {
        Optional<Pet> pet = petMapper.findById(id);
        Pet Pet =pet.orElseThrow(() -> new PetNotFoundException("That ID:" + id + " not registered."));
        return Pet;
        }


        public Pet insert(String animalSpecies, String name, LocalDate birthday, BigDecimal weight){
            Pet pet = new Pet(animalSpecies, name, birthday, weight);
            petMapper.insert(pet);
            return pet;
        }
    }