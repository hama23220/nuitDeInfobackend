package poly.edu.nuitdeinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.PersonneSauve;
import poly.edu.nuitdeinfo.Repository.IPersonneSauve;

import java.util.Optional;

@Service
public class PersonneSauveService
{
    @Autowired
    private IPersonneSauve iPersonneSauve;

    public Optional<PersonneSauve> getPersonneSauveByid(final Integer id){
        return iPersonneSauve.findById(id);
    }

    public Iterable<PersonneSauve> getAllPersonneSauve (){
        return iPersonneSauve.findAll();
    }

    public void deletePersonneSauve (final Integer id){
        iPersonneSauve.deleteById(id);
    }

    public PersonneSauve savePersonneSauve (PersonneSauve personneSauve){
        iPersonneSauve.save(personneSauve);
        return personneSauve;
    }

    public void update (PersonneSauve personneSauve, Integer id){
        iPersonneSauve.save(personneSauve);
    }
}
