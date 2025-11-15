package org.example.savetravels.controllers;

import jakarta.validation.Valid;
import org.example.savetravels.moels.Travel;
import org.example.savetravels.service.TravelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TravleControllers {
    public final TravelService travelService;

    public TravleControllers(TravelService travelService) {
        this.travelService = travelService;
    }

    @RequestMapping("/")
    public String travels(@ModelAttribute("travel")Travel travel, Model model) {
        List<Travel> travels = travelService.getAllTravels();
        model.addAttribute("travels", travels);
        model.addAttribute("travel", travel);
        return "index";
    }

    @RequestMapping("/travels")
    public String travel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }else{
            travelService.createTravel(travel);
            return "index";
        }
    }

    @RequestMapping("/expenses/{id}")
    public String expenses(@PathVariable("id") Long id, Model model){
        Travel T = travelService.findTravel(id);
        model.addAttribute("plane", T);
        return "show";

    }
    @RequestMapping("/expenses/edit/{id}")
    public String editTravel(@PathVariable("id") Long id, Model model){
        Travel traveler = travelService.findTravel(id);
        model.addAttribute("travel", traveler);
        return "edit";
    }

    @PutMapping(value = "/travels/{id}")
    public String updateTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("travel", travel);
        }
            travelService.updateTravel(travel);
            return "redirect:/";
    }

    @DeleteMapping(value="/travels/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        travelService.deleteTravel(id);
        return "redirect:/";
    }



}
