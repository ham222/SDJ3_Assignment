package via.sdj3.orderapi.repository;


import org.springframework.stereotype.Repository;
import via.sdj3.orderapi.model.Animal;

import java.util.ArrayList;
import java.util.Date;

@Repository
public class AnimalRepository
{
    private static final ArrayList<Animal> animals = new ArrayList<>();
    private static AnimalRepository instance;

    public static AnimalRepository getInstance()
    {
        if (instance == null)
        {
            instance = new AnimalRepository();

        }
        return instance;
    }


//    static {
//        initDataSource();
//    }

    private AnimalRepository(){
        addAnimal(new Animal( 23, new Date(22, 05,4), "New York"));
        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
    }

//    private static void initDataSource() {
//        addAnimal(new Animal( 23, new Date(22, 05,4), "New York"));
//        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
//        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
//        addAnimal(new Animal(23, new Date(2022, 05,4), "New York"));
//
//    }

    public static void addAnimal(Animal animal)
    {
        animals.add(animal);
        animals.get(animals.indexOf(animal)).setId(animals.indexOf(animal));
    }
    public Animal getAnimal(int id)
    {
        return animals.get(id);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
