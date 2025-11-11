package org.example.api.controllers;

import org.example.api.models.Book;
import org.example.api.services.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Books  {
    private final BookService bookService;
    public Books(BookService bookService){
        this.bookService = bookService;
    }
    // other methods removed for brevity


    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
            @PathVariable("id") Long id,
            @RequestParam(value="title") String title,
            @RequestParam(value="description") String desc,
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

//    (Long id, String title, String desc, String lang, int numOfPages)
    @RequestMapping(value="/api/books", method=RequestMethod.GET)
    public Book createBook() {
        return bookService.createBook(new Book( "peace and war", "hostorical book", "russan", 114 ));
    }

    @DeleteMapping(value="/api/book/{id}")
    public void destroy(@PathVariable("id") Long id) {
         bookService.deleteBook(id);
    }
}
