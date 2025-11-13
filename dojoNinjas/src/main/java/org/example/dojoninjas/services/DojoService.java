package org.example.dojoninjas.services;

import org.example.dojoninjas.models.Dojo;
import org.example.dojoninjas.repository.DojoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    public final DojoRepo  dojoRepo;

    public DojoService(DojoRepo dojoRepo) {
        this.dojoRepo = dojoRepo;
    }
    public void createDojo(Dojo dojo) {
        dojoRepo.save(dojo);
    }

    public List<Dojo> findAllDojo() {
        return (List<Dojo>) dojoRepo.findAll();
    }
    public Dojo findDojo(Long id) {
        Optional<Dojo> option =  dojoRepo.findById(id);
        if(option.isPresent()) {
            return option.get();
        }else {
            return null;
        }

    }

}
