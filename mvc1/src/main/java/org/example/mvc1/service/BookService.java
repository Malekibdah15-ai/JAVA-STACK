package org.example.mvc1.service;

import org.example.mvc1.model.Book;
import org.example.mvc1.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    public final BookRepo bookRepo;
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public Book updateBook(Long id, String title, String description, String language, Integer numberOfPages) {
        // Check if the book exists
        Optional<Book> optionalBook = bookRepo.findById(id);

        if(optionalBook.isPresent()) {
            Book book = optionalBook.get();

            book.setTitle(title);
            book.setDescription(description);
            book.setLanguage(language);
            book.setNumberOfPages(numberOfPages);

            return bookRepo.save(book);
        } else {
            return null; // or throw an exception
        }
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}




}
