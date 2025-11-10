package org.example.ninjagame;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

@Controller
public class gamecontrller {
    @GetMapping("/")
    public String index(HttpSession session) {
        if(session.getAttribute("gold")==null){
            session.setAttribute("gold",0);
        }
        if(session.getAttribute("list")==null){
            session.setAttribute("list",new ArrayList<>());
        }
        return "index.jsp";
    }
    @PostMapping("/gold")
    public String game(@RequestParam(value = "farm",required = false) String farm,
                    @RequestParam(value = "cave",required = false) String cave,
                    @RequestParam(value = "House",required = false) String House,
                    @RequestParam(value = "Quest",required = false) String Quest, HttpSession session){
        int Gold = (int)session.getAttribute("gold");
        Random rand = new Random();
        int earned = 0;
        Date date = new Date();
        String message = "";
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");

        if(farm!=null) {
            earned = rand.nextInt(11) + 10;
            Gold += earned;
            message = String.format("You entered a cave and earned %d gold. (%s)", earned, date);


        }else if(cave!=null) {
            earned = rand.nextInt(5) + 5;
            Gold += earned;
            message = String.format("You entered a cave and earned %d gold. (%s)", earned, date);

        }else if(House!=null){
            earned = rand.nextInt(2) + 3;
            Gold += earned;
            message = String.format("You entered a cave and earned %d gold. (%s)", earned, date);
        }else if(Quest!=null){
            earned = rand.nextInt(50);
            Gold += earned;
            message = String.format("You entered a cave and earned %d gold. (%s)", earned, date);
        }
        list.add(message);
        session.setAttribute("gold",Gold);
        session.setAttribute("list",list);

        return "redirect:/";
    }


}
