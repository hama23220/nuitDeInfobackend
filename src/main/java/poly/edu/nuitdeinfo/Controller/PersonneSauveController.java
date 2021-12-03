package poly.edu.nuitdeinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.PersonneSauve;
import poly.edu.nuitdeinfo.Service.PersonneSauveService;

import java.util.Optional;

@RestController
@RequestMapping("/PersonneSauve")
public class PersonneSauveController {
    @Autowired
    private PersonneSauveService personneSauveService;

    @GetMapping("/all")
    private Iterable<PersonneSauve> getAllPersonneSauv()
    {
        return personneSauveService.getAllPersonneSauve();
    }

    @GetMapping("/find/{id}")
    private Optional<PersonneSauve> getPersonneSauvByid(@PathVariable("id") int id)
    {
        return personneSauveService.getPersonneSauveByid(id);
    }

    @PostMapping("/add")
    private PersonneSauve savePersonneSauv(@RequestBody PersonneSauve personneSauve)
    {
        personneSauveService.savePersonneSauve(personneSauve);
        return personneSauve;
    }

    @DeleteMapping("/delete/{id}")
    private void deletePersonneSauv(@PathVariable("id") Integer id){
        personneSauveService.deletePersonneSauve(id);
    }
}
