package org.example.api.repositories;

import org.example.api.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {

    List<Book> findAll();

    List<Book> findByDescriptionContaining(String search);

    Long countByTitleContaining(String search);

    Long deleteByTitleStartingWith(String search);
}
