package net.tekpartner.learn.restjpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Integration tests to run the application {@link LearnRestJPAApplication}.
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnRestJPAApplicationTests {

  @Autowired
  private WebApplicationContext context;

  private MockMvc mvc;

  @Test
  public void contextLoads() {
  }

  @Before
  public void setUp() {
    this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
  }

  @Test
  public void testHome() throws Exception {
    this.mvc.perform(get("/cities")).andExpect(status().isOk());
  }
}
