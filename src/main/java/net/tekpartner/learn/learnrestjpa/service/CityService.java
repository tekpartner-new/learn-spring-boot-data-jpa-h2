package net.tekpartner.learn.learnrestjpa.service;

import net.tekpartner.learn.learnrestjpa.persistence.model.City;

import javax.validation.Valid;
import java.util.List;

public interface CityService {

    List<City> getAllCities();

    City saveCity(@Valid City newCity);
}
