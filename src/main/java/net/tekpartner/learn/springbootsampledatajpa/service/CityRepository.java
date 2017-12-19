package net.tekpartner.learn.springbootsampledatajpa.service;

import net.tekpartner.learn.springbootsampledatajpa.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

interface CityRepository extends Repository<City, Long> {

    Page<City> findAll(Pageable pageable);

    Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
                                                                       String country, Pageable pageable);

    City findByNameAndCountryAllIgnoringCase(String name, String country);

}
