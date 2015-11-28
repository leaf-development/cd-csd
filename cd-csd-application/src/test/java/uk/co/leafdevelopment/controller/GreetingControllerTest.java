package uk.co.leafdevelopment.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GreetingControllerTest {

	private MockMvc mockMvc;

	private GreetingController greetingController;

	@Before
	public void setup() {
		greetingController =  new GreetingController();
		mockMvc = MockMvcBuilders.standaloneSetup(greetingController).build();
	}

	@Test
	public void shouldRespondWithHelloMateWhenNoNameIsSupplied() throws Exception {
		// Given
		String name = "";

		// When
		ResultActions result = mockMvc.perform(get("/hello").param("name", name));

		// Then
		result.andExpect(status().isOk());
		result.andExpect(content().string(is("Hello mate")));
	}

}