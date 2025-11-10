package org.example.dispaly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class data {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/date")
        public  String date(Model model){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        model.addAttribute("currentDate", sdf.format(date));
        return "date";

        }
    @GetMapping("/time")
    public  String time(Model model){
        Date dte = new Date();
        SimpleDateFormat simple = new SimpleDateFormat("h:mm:a");
        model.addAttribute("hourDate", simple.format(dte));
        return "Time";

    }
}
