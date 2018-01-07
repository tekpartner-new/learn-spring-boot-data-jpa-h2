package net.tekpartner.learn.restjpa.service;

import net.tekpartner.learn.restjpa.persistence.model.City;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration tests for {@link CityService}.
 *
 * @author Chandrashekar R. Gaajula
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class CityServiceImplTest {

    @Autowired
    private CityService cityService;

    @Before
    public void setUp() {
    }

    @Test
    public void whenValidCityAndCountry_thenCityShouldBeFound() {
        List<City> allCities = cityService.getAllCities();
        assertThat(allCities.size() == 7);
    }
}
