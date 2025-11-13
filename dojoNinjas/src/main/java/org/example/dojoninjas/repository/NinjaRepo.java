package org.example.dojoninjas.repository;

import org.example.dojoninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;

public interface NinjaRepo extends CrudRepository<Ninja, Integer> {
}
