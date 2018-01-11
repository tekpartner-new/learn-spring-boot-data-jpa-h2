package net.tekpartner.learn.restjpa.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.tekpartner.learn.restjpa.LearnRestJPAApplication;
import net.tekpartner.learn.restjpa.persistence.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearnRestJPAApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class CityControllerTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetAllCities() throws Exception {
        mockMvc.perform(get("/cities")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }


    @Test
    public void testSaveCity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        City newCity = new City("Folsom", "United States");
        newCity.setState("California");
        newCity.setMap("-100, 100");
        mockMvc.perform(post("/cities")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsBytes(newCity)))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }
}
