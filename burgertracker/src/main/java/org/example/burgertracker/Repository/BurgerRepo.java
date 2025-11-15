package org.example.burgertracker.Repository;

import org.example.burgertracker.models.Burger;
import org.springframework.data.repository.CrudRepository;

public interface BurgerRepo extends CrudRepository<Burger, Long> {
}
