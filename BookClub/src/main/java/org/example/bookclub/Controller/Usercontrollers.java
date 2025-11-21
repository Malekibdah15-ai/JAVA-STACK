package org.example.bookclub.Controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.example.bookclub.Repository.BookRepo;
import org.example.bookclub.Repository.UserRepo;
import org.example.bookclub.Service.BookService;
import org.example.bookclub.Service.UserService;
import org.example.bookclub.models.Book;
import org.example.bookclub.models.Login;
import org.example.bookclub.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class Usercontrollers {
    @Autowired
    UserService userService;
    @Autowired
    BookService bookService;

    @GetMapping("/user/login")
    public String index(@ModelAttribute("newUser")User user , @ModelAttribute("newLogin")Login log ,Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new Login());
        return "login.jsp";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User user, @ModelAttribute("newLogin")Login log ,  BindingResult result, HttpSession session, Model model) {
        User newUser = userService.register(user, result);
        if (result.hasErrors()) {
            return "login.jsp";
        }

        session.setAttribute("users", newUser.getId());
        return "redirect:/user/login";

    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") Login log, @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, Model model) {
        User login = userService.login(log, result);
        if (result.hasErrors()) {
            return "login.jsp";
        }
        session.setAttribute("user", login.getId());
        return "redirect:/show/books";
    }

    @RequestMapping("/new/book")
    public String newBook(@ModelAttribute("book") Book book) {

        return "Book.jsp";
    }

    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book") Book book,BindingResult result,HttpSession session){

        if(result.hasErrors()){
            return "Book.jsp";
        }
       User user = userService.getById((Long)session.getAttribute("user"));
        Book book1= bookService.createBook(book);
        book1.setUser(user);
        bookService.updateBook(book1);
        return "redirect:/new/book";

    }
    @RequestMapping("/show/books")
    public String showBook(Model model, HttpSession session){
        model.addAttribute("allbooks", bookService.getAllBooks());
        model.addAttribute("userid", userService.getById((Long)session.getAttribute("user")));
        return "show.jsp";
    }

    @GetMapping("/display/book/{id}")
    public String displayBook(@PathVariable("id")Long book ,Model model){
        Book book1 = bookService.getBookById(book);
        model.addAttribute("book", book1);
        return "display.jsp";
    }

    @GetMapping("/book/edit/{id}")
    public String editBook(@PathVariable("id")Long id,Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    @RequestMapping(value = "/edit/book/{id}", method = RequestMethod.PUT)
    public String updateBook(@Valid @ModelAttribute("book")Book book,BindingResult result ,Model model){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        bookService.updateBook(book);
        return "redirect:/show/books";
    }
    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id")Long id,Model model){
        bookService.deleteBook(id);
        return "redirect:/show/books";
    }


}

