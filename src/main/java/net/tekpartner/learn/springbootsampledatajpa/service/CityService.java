package net.tekpartner.learn.springbootsampledatajpa.service;

import net.tekpartner.learn.springbootsampledatajpa.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {

    Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);

    City getCity(String name, String country);

}
