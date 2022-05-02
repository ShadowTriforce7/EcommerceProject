package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CountryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Country}
     *   <li>{@link Country#setCode(String)}
     *   <li>{@link Country#setId(int)}
     *   <li>{@link Country#setName(String)}
     *   <li>{@link Country#setStates(List)}
     * </ul>
     */
    @Test
    void testConstructor() {
        Country actualCountry = new Country();
        actualCountry.setCode("Code");
        actualCountry.setId(1);
        actualCountry.setName("Name");
        ArrayList<State> stateList = new ArrayList<>();
        actualCountry.setStates(stateList);
        assertEquals("Code", actualCountry.getCode());
        assertEquals(1, actualCountry.getId());
        assertEquals("Name", actualCountry.getName());
        assertSame(stateList, actualCountry.getStates());
    }
}

