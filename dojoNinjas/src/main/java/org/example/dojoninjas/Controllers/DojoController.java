package org.example.dojoninjas.Controllers;

import jakarta.validation.Valid;
import org.example.dojoninjas.models.Dojo;
import org.example.dojoninjas.models.Ninja;
import org.example.dojoninjas.services.DojoService;
import org.example.dojoninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DojoController {
    private final DojoService dojoService;

    private final NinjaService ninjaService;

    public DojoController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }


    @RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo")  Dojo dojo) {
        return "dojo.jsp";
    }
    @PostMapping("/dojos")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "dojo.jsp";
        }else{
            dojoService.createDojo(dojo);

            return "dojo.jsp";

        }
    }
    @RequestMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        model.addAttribute("dojos", dojoService.findAllDojo());
        return "ninja.jsp";
    }
    @PostMapping("/ninjas")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "ninja.jsp";
        }else{
            ninjaService.createNinja(ninja);
            return "ninja.jsp";

        }
    }
    @RequestMapping("/dojo/{id}")
    public String showData(@PathVariable("id") Long id, Model model) {
        model.addAttribute("doj", dojoService.findDojo(id));
        return "show.jsp";
    }
}
