package org.example.burgertracker.controller;

import jakarta.validation.Valid;
import org.example.burgertracker.Repository.BurgerRepo;
import org.example.burgertracker.Service.BurgerService;
import org.example.burgertracker.models.Burger;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class BurgerController {
    public BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }



    @RequestMapping ("/burger")
    public String burger(@ModelAttribute("burger") Burger burger, Model model) {
        List<Burger> burgers = burgerService.getAllBurgers();
        model.addAttribute("burgers", burgers);

        return "index.jsp";
    }
    @PostMapping("/burgers")
    public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if(result.hasErrors()){
            return "index.jsp";
        }else{
            burgerService.createBurger(burger);

            return "index.jsp";

        }
    }






}
