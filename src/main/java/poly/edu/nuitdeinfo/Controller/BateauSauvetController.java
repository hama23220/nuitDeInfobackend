package poly.edu.nuitdeinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.BateauSauveteur;
import poly.edu.nuitdeinfo.Service.BateauSauveteurService;
import java.util.Optional;

@RestController
@RequestMapping("/bateausauvet")
public class BateauSauvetController {
    @Autowired
    private BateauSauveteurService bateauSauveteurService;

    @GetMapping("/all")
    private Iterable<BateauSauveteur> getAllbsauvetub()
    {
        return bateauSauveteurService.getAllbsauvet();
    }

    @GetMapping("/find/{id}")
    private Optional<BateauSauveteur> getbsauvetbByid(@PathVariable("id") int id)
    {
        return bateauSauveteurService.getbsauvetByid(id);
    }

    @PostMapping("/add")
    private BateauSauveteur savebsauvetb(@RequestBody BateauSauveteur bateauSauveteur)
    {
        bateauSauveteurService.savebsauvet(bateauSauveteur);
        return bateauSauveteur;
    }

    @DeleteMapping("/delete/{id}")
    private void deletebsauvetub(@PathVariable("id") Integer id){
        bateauSauveteurService.deletebsauvet(id);
    }
}
