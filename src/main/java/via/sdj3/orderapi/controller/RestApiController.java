package via.sdj3.orderapi.controller;


import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sdj3.orderapi.repository.AnimalRepository;

@RestController
@RequestMapping
public class RestApiController
{
    AnimalRepository animalRepository = new AnimalRepository();
    @PostMapping("/animal/") // C endpoint
    public String createOrder()
    {
        System.out.println("\n [Backend - Server] create operation is reached");
        return "HTTP POST - Create";
    }

    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)// R endpoint
    public String getAllAnimals()
    {
        System.out.println("\n [Backend - Server] read operation is reached");
        String s = new Gson().toJson(animalRepository.getAnimals());
        return s;
    }

    @PutMapping("/orders/{id}") // U endpoint
    public String updateOrder()
    {
        System.out.println("\n [Backend - Server] update operation is reached");
        return "HTTP POST - Update";
    }

    @DeleteMapping("/orders/{id}") // D endpoint
    public String deleteOrder()
    {
        System.out.println("\n [Backend - Server] delete operation is reached");
        return "HTTP POST - Delete";
    }




}
