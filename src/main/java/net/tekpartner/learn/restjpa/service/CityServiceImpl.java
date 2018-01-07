package net.tekpartner.learn.restjpa.service;

import net.tekpartner.learn.restjpa.persistence.jpa.CityRepository;
import net.tekpartner.learn.restjpa.persistence.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service("cityService")
class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City saveCity(@Valid City newCity) {
        return cityRepository.saveAndFlush(newCity);
    }
}
