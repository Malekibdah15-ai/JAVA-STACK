package org.example.omikuji;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class omikujiForm {
    @RequestMapping("/omikuji")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(@RequestParam(value="select") int select,
                        @RequestParam(value="city") String City,
                        @RequestParam(value="person") String Person,
                        @RequestParam(value="endeavor") String Endeavor,
                        @RequestParam(value="living") String Living,
                        @RequestParam(value="text") String Text,HttpSession session){
        session.setAttribute("select",select);
        session.setAttribute("city",City);
        session.setAttribute("person",Person);
        session.setAttribute("endeavor",Endeavor);
        session.setAttribute("living",Living);
        session.setAttribute("text",Text);
        return "redirect:/show";


    }
    @RequestMapping("/show")
    public String omikuji(){
        return "home.jsp";
    }

}
