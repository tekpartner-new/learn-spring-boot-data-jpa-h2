package net.tekpartner.learn.restjpa.service;

import net.tekpartner.learn.restjpa.persistence.model.City;

import javax.validation.Valid;
import java.util.List;

public interface CityService {

    List<City> getAllCities();

    City saveCity(@Valid City newCity);
}
