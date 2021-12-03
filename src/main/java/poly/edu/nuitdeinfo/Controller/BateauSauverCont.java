package poly.edu.nuitdeinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.BateauSauver;
import poly.edu.nuitdeinfo.Service.BateauSauverService;

import java.util.Optional;

@RestController
@RequestMapping("/bateausauver")
public class BateauSauverCont {

    @Autowired
    private BateauSauverService bateauSauverService;

    @GetMapping("/all")
    private Iterable<BateauSauver> getAllbsauveru()
    {
        return bateauSauverService.getAllbsauver();
    }

    @GetMapping("/find/{id}")
    private Optional<BateauSauver> getbsauverubByid(@PathVariable("id") int id)
    {
        return bateauSauverService.getbsauverByid(id);
    }

    @PostMapping("/add")
    private BateauSauver savebsauver(@RequestBody BateauSauver bateauSauver)
    {
        bateauSauverService.savebsauver(bateauSauver);
        return bateauSauver;
    }

    @DeleteMapping("/delete/{id}")
    private void deletebsauver(@PathVariable("id") Integer id){
        bateauSauverService.deletebsauver(id);
    }
}
