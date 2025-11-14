package org.example.mvc1.controller;

import org.example.mvc1.model.Book;
import org.example.mvc1.service.BookService;
import org.springframework.web.bind.annotation.*;



@RestController
public class BookController {
    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public class BooksApi {
        private final BookService bookService;
        public BooksApi(BookService bookService){
            this.bookService = bookService;
        }
        // other methods removed for brevity


        @RequestMapping(value="/api/books/{id}", method= RequestMethod.PUT)
        public Book update(
                @PathVariable("id") Long id,
                @RequestParam(value="title") String title,
                @RequestParam(value="description") String desc,
                @RequestParam(value="language") String lang,
                @RequestParam(value="pages") Integer numOfPages) {
            Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
            return book;
        }

        @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
        public void destroy(@PathVariable("id") Long id) {
            bookService.deleteBook(id);
        }
    }
}
