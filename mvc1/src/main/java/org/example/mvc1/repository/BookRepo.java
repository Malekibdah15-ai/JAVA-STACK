package org.example.mvc1.repository;

import org.example.mvc1.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepo extends CrudRepository<Book,Long> {
}
