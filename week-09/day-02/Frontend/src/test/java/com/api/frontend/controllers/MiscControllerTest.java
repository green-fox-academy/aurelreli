package com.api.frontend.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(MiscController.class)

public class MiscControllerTest {

  @Autowired
  private MockMvc mockMvc;

  //Appenda
  @Test
  public void givenText_whenAppenda_thenAppendedWithA() throws Exception{
    mockMvc.perform(get("/appenda/kuty")).andExpect(status().isOk())
        .andExpect(jsonPath("$.appended", is("kutya")));
  }

  //Doubling
  @Test
  public void givenInput_doublesInput() throws Exception {
    mockMvc.perform(get("/doubling?input=5")).andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(10)));
  }

  //Greeter
  @Test
  public void givenNameAndTitle_returnsGreeting() throws Exception {
    mockMvc.perform(get("/greeter?name=János&title=Student")).andExpect(status().isOk())
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there János, my dear Student!")));
  }

}
