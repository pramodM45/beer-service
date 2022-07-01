package com.microservices.beerservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    MockMvc mockMvc;

    @Test
    void getBeerById() {

    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeerById() {
    }
}