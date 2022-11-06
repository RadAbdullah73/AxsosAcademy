package com.codingdojo.saveTravels.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.saveTravels.models.Travels;
import com.codingdojo.saveTravels.repositories.TravelRepository;
@Service
public class TravelService {
	private final TravelRepository travelRepository;
	 public TravelService(TravelRepository travelRepository) {
	     this.travelRepository = travelRepository;
	 }
	 // returns all the books
	 public List<Travels> allTravels() {
	     return travelRepository.findAll();
	 }
	 // creates a book
	 public Travels createTravel(Travels b) {
	     return travelRepository.save(b);
	 }
	 public void deleteTravel (Long id) {
		 travelRepository.deleteById(id);
	 }
	 public Travels updateTr(Travels b) {
	     return travelRepository.save(b) ;
	 }
	 
//	 public Travels updateTravel(Long id, String ExpenseName, String Vendor,Integer amount, String descreption) {
//		 Optional<Travels> travel1 = travelRepository.findById(id);
//		 if(travel1.isPresent()) {
//		 travel1.get().setExpenseName(ExpenseName);
//		 travel1.get().setVendor(Vendor);
//		 travel1.get().setAmount(amount);
//		 travel1.get().setDescription(descreption);
//		 travelRepository.save(travel1.get());
//		 return travel1.get() ;
//		 }
//		 else {
//			 return null ;
//		 }
//		 
//	 }
	 // retrieves a book
	 public Travels findTravel(Long id) {
	     Optional<Travels> optionalTravel = travelRepository.findById(id);
	     if(optionalTravel.isPresent()) {
	         return optionalTravel.get();
	     } else {
	         return null;
	     }
	 }

}
