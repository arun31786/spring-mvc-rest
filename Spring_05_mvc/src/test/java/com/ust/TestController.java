package com.ust;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ust.controller.PersonController;
import com.ust.entity.Person;
/*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring.xml")
public class TestController {
	private MockMvc mockMvc;
	@Autowired
	private PersonController personController;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
        System.out.println(mockMvc);
    }
	@Test
	public void getShouldResultPersonPage() throws Exception{
	    this.mockMvc.perform(get("/persons")).andExpect(view().name("persons"));
	}
	@Test
	public void postShouldResultPersonPage() throws Exception{
//		Person p = new Person("Mike", "Canada");
        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/person/add")
                .accept(MediaType.TEXT_HTML)
                .param("name", "arun")
                .param("country", "india")
            )
            .andExpect(view().name("redirect:/mvc/persons"));
//            .andExpect(model().errorCount(1))
//            .andExpect(status().isOk())
//            .andExpect(model().attribute("message", "some message"));
        
	}
}
