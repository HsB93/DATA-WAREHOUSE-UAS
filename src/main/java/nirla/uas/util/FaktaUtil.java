package nirla.uas.util;

import nirla.uas.model.Fakta;
import nirla.uas.repo.FaktaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//StudentService.java
@Service
public class FaktaUtil {
    @Autowired
    private FaktaRepo repo;

    public List<Fakta> listAll (){
        return repo.findAll();
    }
    public void save(Fakta fkt) {
        repo.save(fkt);
    }
    public Fakta get(int id) {
        return repo.findById(id).get();
    }
    public void delete(int id) {
        repo.deleteById(id);
    }

}
