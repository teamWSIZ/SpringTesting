package controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:mdispatcher-servlet-for-test.xml")
public class UserControllerTest {

    @Autowired WebApplicationContext wac;
    @Autowired MockHttpSession session;
    @Autowired MockHttpServletRequest request;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }



    @Test
    public void testShouldGetRoot() throws Exception {
        getMockMvc().perform(get("/"))
                .andExpect(status().isOk());
    }


    @Test
    public void testShouldFailGetAbra() throws Exception {
        getMockMvc().perform(get("/abra"))
                .andExpect(status().isNotFound());;
    }


    @Test
    public void testShouldReadReturnedObject() throws Exception {
        getMockMvc().perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").exists());
    }

    protected MockMvc getMockMvc() {
        return mockMvc;
    }
}
