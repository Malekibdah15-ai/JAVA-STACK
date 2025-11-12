package org.example.data;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller

public class main   {

    @RequestMapping("/")
    public String display() {
        return "display";
    }

    @RequestMapping("/date")
    public String index(Model model) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        model.addAttribute("currentDate", sdf.format(date));
        return "date";
    }
    @RequestMapping("/time")
    public String time(Model model) {
        Date date = new Date();
        SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
        model.addAttribute("currentTime", simple.format(date));
        return "time";
    }
}
