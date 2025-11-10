package org.example.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
    @RequestMapping("/")
    public String index(HttpSession session) {
        if(session.getAttribute("counter") == null) {
            session.setAttribute("counter", 1);
        }
        else{
            int counter = (Integer)session.getAttribute("counter");
            session.setAttribute("counter", counter + 1);
        }
        return "landing.jsp";
    }
    @RequestMapping("/counter")
    public String count(HttpSession session) {

        return "home.jsp";
    }
}
