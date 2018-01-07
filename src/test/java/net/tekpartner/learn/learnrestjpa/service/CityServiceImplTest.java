package net.tekpartner.learn.learnrestjpa.service;

import net.tekpartner.learn.learnrestjpa.persistence.jpa.CityRepository;
import net.tekpartner.learn.learnrestjpa.persistence.model.City;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * @author Chandrashekar R. Gaajula
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class CityServiceImplTest {

    @Autowired
    private CityService cityService;

    @MockBean
    private CityRepository cityRepository;

    @Before
    public void setUp() {
        // given
        City sanJose = new City("San Jose", "USA");

        given(cityRepository.findByNameAndCountryAllIgnoringCase(sanJose.getName(), sanJose.getCountry()))
                .willReturn(sanJose);
    }

    @Test
    public void whenValidCityAndCountry_thenCityShouldBeFound() {
        City found = cityService.getCity("San Jose", "USA");
        assertThat(found.getName()).isEqualTo("San Jose");
    }
}
