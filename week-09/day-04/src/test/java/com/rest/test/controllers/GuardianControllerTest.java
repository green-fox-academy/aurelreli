package com.rest.test.controllers;

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

@WebMvcTest(GuardianController.class)

public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;


  //GROOT
  @Test
  public void givenMessage_statusIsOk() throws Exception {
    mockMvc.perform(get("/groot?message=something")).andExpect(status().isOk());
  }

  @Test
  public void givenMessage_responseIsAsExpected() throws Exception {
    mockMvc.perform(get("/groot?message=something")).andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("something")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void givenNoMessage_statusIsNotOk() throws Exception {
    mockMvc.perform(get("/groot")).andExpect(status().isBadRequest());
  }

  @Test
  public void givenNoMessage_errorMessageIsAsExpected() throws Exception {
    mockMvc.perform(get("/groot")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }


  //YONDU
  @Test
  public void givenParameters_statusIsOk() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.00&time=10.00")).andExpect(status().isOk());
  }

  @Test
  public void givenParameters_responseIsAsExpected() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.00&time=10.00")).andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.00)))
        .andExpect(jsonPath("$.time", is(10.00)))
        .andExpect(jsonPath("$.speed", is(10.00)));
  }

  @Test
  public void givenNoParameters_statusIsNotOk() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest());
  }

  @Test
  public void givenNoParameters_errorMessageIsAsExpected() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Parameters not provided.")));
  }


  //DRAX
  @Test
  public void givenCalorieTable_isNotEmpty() throws Exception {
    mockMvc.perform(get("/drax")).andExpect(status().isOk())
        .andExpect(jsonPath("$.foods").isArray())
        .andExpect(jsonPath("$.foods", hasSize(4)));
  }

  @Test
  public void givenCalorieTable_whenAddFood_thenFoodIsAddedToCalorieTable() throws Exception {
    mockMvc.perform(post("/drax/add?name=falafel&amount=2&calorie=100")).andExpect(status().isOk())
        .andExpect(jsonPath("$.foods", hasSize(5)));
  }

  @Test
  public void givenCalorieTable_whenRemoveFood_ThenFoodIsRemovedFromCalorieTable() throws Exception {
    mockMvc.perform(post("/drax/remove?name=quesadilla")).andExpect(status().isOk())
        .andExpect(jsonPath("$.foods", hasSize(3)));
  }

  @Test
  public void givenCalorieTable_whenModifyAmount_amountIsAsExpected() throws Exception {
    mockMvc.perform(post("/drax/modify?name=pizza&amount=2")).andExpect(status().isOk())
        .andExpect(jsonPath("$.foods[0].amount", is(2)));
  }

}