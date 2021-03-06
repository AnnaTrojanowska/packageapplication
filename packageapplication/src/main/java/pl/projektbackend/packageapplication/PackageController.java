package pl.projektbackend.packageapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PackageController {



    @Autowired
    PackageRepository packageRepository;
    @RequestMapping("/logi")
    public String index(){
    return "index";
    }

    @RequestMapping("/user_panel")
    public String user_panel(){
        return "user_panel";
    }
    @RequestMapping("/delivery_panel")
    public String delivery_panel(){
        return "delivery_panel";
    }

    @GetMapping("/user")
    public List<User> getAll(){
       return packageRepository.getAll();
    }

    @GetMapping("/user/{idUsers}")
    public User getById(@PathVariable("idUsers") int idUsers){
        return packageRepository.getById(idUsers);
    }

}
