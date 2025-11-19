package org.example.authentcation.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.example.authentcation.Service.UserService;
import org.example.authentcation.models.LoginUser;
import org.example.authentcation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "login";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, Model model) {
        User newUser = userService.register(user, result);
        if (result.hasErrors()) {
            model.addAttribute("newUser", new LoginUser());
            return "login";
        }

        session.setAttribute("user", newUser.getId());
        return "redirect:/";

    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser log, BindingResult result, HttpSession session, Model model) {
        User login = userService.login(log, result);
        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "login";
        }
        session.setAttribute("user", login);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showUser(HttpSession session,  Model model) {

        model.addAttribute("user", userService.getById((Long)session.getAttribute("user")));
        return "show";

    }

}
