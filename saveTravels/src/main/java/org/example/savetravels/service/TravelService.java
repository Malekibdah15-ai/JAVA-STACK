package org.example.savetravels.service;

import org.example.savetravels.Repositry.TravelRepo;
import org.example.savetravels.moels.Travel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {
    public final TravelRepo travelRepo;
    public TravelService(TravelRepo travelRepo) {
        this.travelRepo = travelRepo;
    }

    public Travel findTravel(Long id) {
        Optional<Travel> optionalBook = travelRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    public void createTravel(Travel travel){
        travelRepo.save(travel);

    }
    public void deleteTravel(Long id) {
        travelRepo.deleteById(id);
    }


    public List<Travel> getAllTravels(){
        return (List<Travel>)travelRepo.findAll();
    }
    public Travel updateTravel(Travel updatedTravel) {
        return travelRepo.save(updatedTravel);
    }

//    public Travel updateTravel(Travel updatedTravel) {
//        Optional<Travel> optionalTravel = travelRepo.findById(updatedTravel.getId());
//
//        if(optionalTravel.isPresent()) {
//            Travel travel = optionalTravel.get();
//
//            travel.setName(updatedTravel.getName());
//            travel.
//
//
//
//            return travelRepo.save(travel);
//        } else {
//            return null;
//        }
//    }
}
