package org.example.burgertracker.Service;

import org.example.burgertracker.Repository.BurgerRepo;
import org.example.burgertracker.models.Burger;

import java.util.List;

public class BurgerService {
    public final BurgerRepo burgerRepo;

    public BurgerService(BurgerRepo burgerRepo) {
        this.burgerRepo = burgerRepo;
    }


    public void createBurger(Burger burger){
        burgerRepo.save(burger);

    }

    public List<Burger> getAllBurgers(){
        return (List<Burger>) burgerRepo.findAll();
    }

}
