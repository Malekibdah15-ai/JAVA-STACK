package org.example.savetravels.Repositry;

import org.example.savetravels.moels.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepo extends CrudRepository<Travel,Long> {

}
