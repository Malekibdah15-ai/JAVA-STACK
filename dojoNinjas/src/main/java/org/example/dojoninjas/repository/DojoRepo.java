package org.example.dojoninjas.repository;

import org.example.dojoninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepo  extends CrudRepository<Dojo, Long>{

}
