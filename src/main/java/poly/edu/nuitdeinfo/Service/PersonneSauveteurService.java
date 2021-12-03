package poly.edu.nuitdeinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.PersonneSauveteur;
import poly.edu.nuitdeinfo.Repository.IPersonneSauveteur;

import java.util.Optional;


@Service
public class PersonneSauveteurService {

    @Autowired
    private IPersonneSauveteur iPersonneSauveteur;

    public Optional<PersonneSauveteur> getPersonneSauvetByid(final Integer id){return iPersonneSauveteur.findById(id);
    }

    public Iterable<PersonneSauveteur> getAllPersonneSauvet (){
        return iPersonneSauveteur.findAll();
    }

    public void deletePersonneSauvet (final Integer id){
        iPersonneSauveteur.deleteById(id);
    }

    public PersonneSauveteur savePersonneSauvet (PersonneSauveteur personneSauvet){
        iPersonneSauveteur.save(personneSauvet);
        return personneSauvet;
    }

    public void update (PersonneSauveteur personneSauvet, Integer id){
        iPersonneSauveteur.save(personneSauvet);
    }
}
