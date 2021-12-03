package poly.edu.nuitdeinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.BateauSauveteur;
import poly.edu.nuitdeinfo.Repository.IBateauSauveteur;

import java.util.Optional;

@Service
public class BateauSauveteurService {
    @Autowired
    private IBateauSauveteur iBateauSauvet;

    public Optional<BateauSauveteur> getbsauvetByid(final Integer id){
        return iBateauSauvet.findById(id);
    }

    public Iterable<BateauSauveteur> getAllbsauvet (){
        return iBateauSauvet.findAll();
    }

    public void deletebsauvet  (final Integer id){
        iBateauSauvet.deleteById(id);
    }

    public BateauSauveteur savebsauvet (BateauSauveteur bateauSauvet){
        iBateauSauvet.save(bateauSauvet);
        return bateauSauvet;
    }

    public void update (BateauSauveteur bateauSauvet, Integer id){
        iBateauSauvet.save(bateauSauvet);
    }
}
