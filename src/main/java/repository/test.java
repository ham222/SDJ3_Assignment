package repository;

import model.Animal;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        AnimalRepository repository = AnimalRepository.getInstance();
        repository.addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
        System.out.println(repository.getAnimal(0).getWeight());
    }
}
