package poly.edu.nuitdeinfo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.PersonneSauve;
import poly.edu.nuitdeinfo.Entity.PersonneSauveteur;
import poly.edu.nuitdeinfo.Service.PersonneSauveService;
import poly.edu.nuitdeinfo.Service.PersonneSauveteurService;

import java.util.Optional;

@RestController
@RequestMapping("/PersonneSauveteur")
public class PersonneSauvetController {
    @Autowired
    private PersonneSauveteurService personneSauveteurService;

    @GetMapping("/all")
    private Iterable<PersonneSauveteur> getAllPersonneSauvet()
    {
        return personneSauveteurService.getAllPersonneSauvet();
    }

    @GetMapping("/find/{id}")
    private Optional<PersonneSauveteur> getPersonneSauvetByid(@PathVariable("id") int id)
    {
        return personneSauveteurService.getPersonneSauvetByid(id);
    }

    @PostMapping("/add")
    private PersonneSauveteur savePersonneSauvet(@RequestBody PersonneSauveteur personneSauveteur)
    {
        personneSauveteurService.savePersonneSauvet(personneSauveteur);
        return personneSauveteur;
    }

    @DeleteMapping("/delete/{id}")
    private void deletePersonneSauvt(@PathVariable("id") Integer id){
        personneSauveteurService.deletePersonneSauvet(id);
    }
}

