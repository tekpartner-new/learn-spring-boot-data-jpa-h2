package net.tekpartner.learn.restjpa.web;

import net.tekpartner.learn.restjpa.persistence.model.City;
import net.tekpartner.learn.restjpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> findAllCities() {
        return cityService.getAllCities();
    }

    @PostMapping
    public ResponseEntity<City> saveCity(@RequestBody @Valid final City newCity) {
        City savedCity = cityService.saveCity(newCity);
        return new ResponseEntity<>(savedCity, HttpStatus.CREATED);
    }
}