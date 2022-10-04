package controller;


import org.springframework.web.bind.annotation.*;
import repository.AnimalRepository;

@RestController
@RequestMapping("/v1")
public class RestApiController {

    AnimalRepository repository = AnimalRepository.getInstance();

    @GetMapping("/animals/{id}")
    public String getAnimal(@PathVariable int id){
        //TODO
        return String.valueOf(repository.getAnimal(id));
    }
    @GetMapping("/animals/")
    public String getAnimal(){
        //TODO
        return "Get all animals";//String.valueOf(repository.getAnimals());
    }




}
