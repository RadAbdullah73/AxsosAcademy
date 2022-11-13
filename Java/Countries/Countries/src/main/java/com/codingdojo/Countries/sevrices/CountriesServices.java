package com.codingdojo.Countries.sevrices;
import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.Countries.repositeries.CitiesRepo;
import com.codingdojo.Countries.repositeries.CountriesRepo;
import com.codingdojo.Countries.repositeries.languageRepo;


@Service
public class CountriesServices {
	@Autowired
    private languageRepo languageRepo;
    private CountriesRepo worldRepo;
    private CitiesRepo CityRepository;
    
    public CountriesServices(languageRepo languageRepo , CountriesRepo CountryRepository , CitiesRepo CityRepository ) {
	     this.languageRepo = languageRepo;
	     this.worldRepo = CountryRepository ;
	     this.CityRepository = CityRepository ;
	     
	 }

    public List<Object[]> allCountries(){

        return worldRepo.getallcountries();
    }

    public List<Object[]> displayTotalCities(){

        return worldRepo.displayTotalCities();
    }


    public List<Object[]> q3(){

        return worldRepo.q3();
    }

    public List<Object[]> q4(){

        return worldRepo.q4();
}

    public List<Object[]> q5(){

        return worldRepo.q6();
}
    public List<Object[]> q6(){

        return worldRepo.q6();
}

    public List<Object[]> q7(){

        return worldRepo.q7();
}
    public List<Object[]> q8(){

        return worldRepo.q8();
}
    
    
    
}
