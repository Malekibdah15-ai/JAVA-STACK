package org.example.api.services;

import org.example.api.models.Book;
import org.example.api.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }    // returns all the books

    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
        Optional<Book> book = bookRepository.findById(id);


        if (book.isPresent()) {
            book.get().setTitle(title);
            book.get().setDescription(desc);
            book.get().setLanguage(lang);
            book.get().setNumberOfPages(numOfPages);
            return bookRepository.save(book.get());

        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {

        bookRepository.deleteById(id);
    }
}
