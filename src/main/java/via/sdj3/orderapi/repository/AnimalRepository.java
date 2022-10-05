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
            addAnimal(new Animal( 23, new Date(2022-1900, 5-1,4), "Boston"));
            addAnimal(new Animal(23, new Date(2022-1900, 5-1,4), "Horsens"));
            addAnimal(new Animal(23, new Date(2022-1900, 5-1,4), "Arhus"));
            addAnimal(new Animal(23, new Date(2022-1900, 5-1,4), "Ciocana"));

        }
        return instance;
    }


    private AnimalRepository(){
    }


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

    public ArrayList<Animal> getAllAnimalsByDate(Date date)
    {
        ArrayList<Animal> x = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getDateDelivered().equals(date));
            {
                x.add(animal);
            }
        }
        return x;
    }

    public ArrayList<Animal> getAllAnimalsByLocation(String location)
    {
        ArrayList<Animal> x = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getOrigin().equals(location))
            {
                x.add(animal);
            }
        }
        return x;
    }

}
