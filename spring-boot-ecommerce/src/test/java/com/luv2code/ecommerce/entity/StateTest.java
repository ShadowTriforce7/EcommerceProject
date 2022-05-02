package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StateTest {
    /**
     * Method under test: {@link State#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new State()).canEqual("Other"));
    }

    /**
     * Method under test: {@link State#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        State state = new State();

        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country);
        state1.setId(1);
        state1.setName("Name");
        assertTrue(state.canEqual(state1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link State}
     *   <li>{@link State#setCountry(Country)}
     *   <li>{@link State#setId(int)}
     *   <li>{@link State#setName(String)}
     * </ul>
     */
    @Test
    void testConstructor() {
        State actualState = new State();
        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());
        actualState.setCountry(country);
        actualState.setId(1);
        actualState.setName("Name");
        assertSame(country, actualState.getCountry());
        assertEquals(1, actualState.getId());
        assertEquals("Name", actualState.getName());
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals() {
        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("Name");
        assertNotEquals(state, null);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals2() {
        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("Name");
        assertNotEquals(state, "Different type to State");
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals3() {
        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("Name");
        assertEquals(state, state);
        int expectedHashCodeResult = state.hashCode();
        assertEquals(expectedHashCodeResult, state.hashCode());
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals4() {
        Country country = new Country();
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("Name");

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName("Name");
        assertNotEquals(state, state1);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals5() {
        Country country = mock(Country.class);
        doNothing().when(country).setCode((String) any());
        doNothing().when(country).setId(anyInt());
        doNothing().when(country).setName((String) any());
        doNothing().when(country).setStates((java.util.List<State>) any());
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("Name");

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName("Name");
        assertNotEquals(state, state1);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals6() {
        Country country = mock(Country.class);
        doNothing().when(country).setCode((String) any());
        doNothing().when(country).setId(anyInt());
        doNothing().when(country).setName((String) any());
        doNothing().when(country).setStates((java.util.List<State>) any());
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(123);
        state.setName("Name");

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName("Name");
        assertNotEquals(state, state1);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals7() {
        Country country = mock(Country.class);
        doNothing().when(country).setCode((String) any());
        doNothing().when(country).setId(anyInt());
        doNothing().when(country).setName((String) any());
        doNothing().when(country).setStates((java.util.List<State>) any());
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName(null);

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName("Name");
        assertNotEquals(state, state1);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals8() {
        Country country = mock(Country.class);
        doNothing().when(country).setCode((String) any());
        doNothing().when(country).setId(anyInt());
        doNothing().when(country).setName((String) any());
        doNothing().when(country).setStates((java.util.List<State>) any());
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName("com.luv2code.ecommerce.entity.State");

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName("Name");
        assertNotEquals(state, state1);
    }

    /**
     * Method under test: {@link State#equals(Object)}
     */
    @Test
    void testEquals9() {
        Country country = mock(Country.class);
        doNothing().when(country).setCode((String) any());
        doNothing().when(country).setId(anyInt());
        doNothing().when(country).setName((String) any());
        doNothing().when(country).setStates((java.util.List<State>) any());
        country.setCode("Code");
        country.setId(1);
        country.setName("Name");
        country.setStates(new ArrayList<>());

        State state = new State();
        state.setCountry(country);
        state.setId(1);
        state.setName(null);

        Country country1 = new Country();
        country1.setCode("Code");
        country1.setId(1);
        country1.setName("Name");
        country1.setStates(new ArrayList<>());

        State state1 = new State();
        state1.setCountry(country1);
        state1.setId(1);
        state1.setName(null);
        assertNotEquals(state, state1);
    }
}

