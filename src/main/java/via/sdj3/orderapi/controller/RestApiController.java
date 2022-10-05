package via.sdj3.orderapi.controller;


import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sdj3.orderapi.model.Animal;
import via.sdj3.orderapi.repository.AnimalRepository;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping
public class RestApiController
{
    AnimalRepository animalRepository = AnimalRepository.getInstance();

    // Get all animals
    @GetMapping (path ="/animal/", produces = MediaType.APPLICATION_JSON_VALUE)// R endpoint
    public String getAllAnimals()
    {
        System.out.println("\n [Backend - Server] read operation is reached");
        String s = new Gson().toJson(animalRepository.getAnimals());
        return s;
    }

    // Get animal by id
    @GetMapping (path ="/animal/{id}",produces=MediaType.APPLICATION_JSON_VALUE)// R endpoint
    public String getAnimalById(@PathVariable int id)
    {
        System.out.println("\n [Backend - Server] read operation is reached");
        String s = new Gson().toJson(animalRepository.getAnimal(id));
        return s;
    }


    // Get all animals by date
    @GetMapping (path ="/animal/date/{year}/{month}/{day}", produces = MediaType.APPLICATION_JSON_VALUE)// R endpoint
    public String getAnimalByDate(@PathVariable int year, @PathVariable int month,  @PathVariable int day)
    {
        System.out.println("\n [Backend - Server] read operation is reached");
        String s = new Gson().toJson(animalRepository.getAllAnimalsByDate(new Date(year,month,day)));
        return s;
    }

    // Get all animals by origin
    @GetMapping (path ="/animal/location/{location}", produces = MediaType.APPLICATION_JSON_VALUE)// R endpoint
    public String getAllAnimalsFromLocation2(@PathVariable String location)
    {
        return new Gson().toJson(animalRepository.getAllAnimalsByLocation(location));
    }





}
