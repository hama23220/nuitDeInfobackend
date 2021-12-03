package poly.edu.nuitdeinfo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.BateauSauver;
import poly.edu.nuitdeinfo.Repository.IBateauSauver;

import java.util.Optional;


@Service
public class BateauSauverService {

    @Autowired
    private IBateauSauver iBateauSauver;

    public Optional<BateauSauver> getbsauverByid(final Integer id){
        return iBateauSauver.findById(id);
    }

    public Iterable<BateauSauver> getAllbsauver (){
        return iBateauSauver.findAll();
    }

    public void deletebsauver  (final Integer id){
        iBateauSauver.deleteById(id);
    }

    public BateauSauver savebsauver (BateauSauver bateauSauver){
        iBateauSauver.save(bateauSauver);
        return bateauSauver;
    }

    public void update (BateauSauver bateauSauver, Integer id){
        iBateauSauver.save(bateauSauver);
    }
}
