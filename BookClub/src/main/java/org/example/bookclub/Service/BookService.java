package org.example.bookclub.Service;

import org.example.bookclub.Repository.BookRepo;
import org.example.bookclub.models.Book;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> getAllBooks(){
        return (List<Book>) bookRepo.findAll();
    }

    public Book createBook(Book book){
        return bookRepo.save(book);
    }
    public Book updateBook(Book book){
        return bookRepo.save(book);
    }

    public Book getBookById(Long id){

        return bookRepo.findById(id).get();
    }
    public void deleteBook(Long id){
        bookRepo.deleteById(id);
    }
}
