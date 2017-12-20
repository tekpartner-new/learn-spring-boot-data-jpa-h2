package net.tekpartner.learn.springbootsampledatajpa.service;

import net.tekpartner.learn.springbootsampledatajpa.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration tests for {@link CityRepository}.
 *
 * @author Oliver Gierke
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class CityRepositoryIntegrationTests {

    @Autowired
    CityRepository repository;

    @Test
    public void findsFirstPageOfCities() {

        Page<City> cities = this.repository.findAll(PageRequest.of(0, 10));
        assertThat(cities.getTotalElements()).isGreaterThan(2L);
    }
}
