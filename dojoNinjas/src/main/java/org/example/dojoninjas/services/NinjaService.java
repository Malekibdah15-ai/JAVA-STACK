package org.example.dojoninjas.services;

import org.example.dojoninjas.models.Ninja;
import org.example.dojoninjas.repository.NinjaRepo;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    public final NinjaRepo ninjaRepo;

    public NinjaService(NinjaRepo ninjaRepo) {
        this.ninjaRepo = ninjaRepo;
    }

    public void createNinja(Ninja ninja){
        ninjaRepo.save(ninja);

    }

}
