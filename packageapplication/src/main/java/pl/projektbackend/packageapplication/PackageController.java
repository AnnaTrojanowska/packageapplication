package pl.projektbackend.packageapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PackageController {


    @Autowired
    PackageRepository packageRepository;


    @GetMapping("/user")
    public List<User> getAll(){
       return packageRepository.getAll();
    }

    @GetMapping("/user/{idUsers}")
    public User getById(@PathVariable("idUsers") int idUsers){
        return packageRepository.getById(idUsers);
    }

}
