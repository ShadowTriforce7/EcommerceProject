package com.luv2code.ecommerce.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PurchaseResponseTest {
    /**
     * Method under test: {@link PurchaseResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PurchaseResponse("42")).canEqual("Other"));
    }

    /**
     * Method under test: {@link PurchaseResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("42");
        assertTrue(purchaseResponse.canEqual(new PurchaseResponse("42")));
    }

    /**
     * Method under test: default or parameterless constructor of {@link PurchaseResponse}
     */
    @Test
    void testConstructor() {
        assertEquals("42", (new PurchaseResponse("42")).getOrderTrackingNumber());
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PurchaseResponse("42"), null);
        assertNotEquals(new PurchaseResponse("42"), "Different type to PurchaseResponse");
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals2() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("42");
        assertEquals(purchaseResponse, purchaseResponse);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse.hashCode());
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals3() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("42");
        PurchaseResponse purchaseResponse1 = new PurchaseResponse("42");
        assertEquals(purchaseResponse, purchaseResponse1);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse1.hashCode());
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals4() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("Order Tracking Number");
        assertNotEquals(purchaseResponse, new PurchaseResponse("42"));
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals5() {
        PurchaseResponse purchaseResponse = new PurchaseResponse(null);
        assertNotEquals(purchaseResponse, new PurchaseResponse("42"));
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals6() {
        PurchaseResponse purchaseResponse = new PurchaseResponse(null);
        PurchaseResponse purchaseResponse1 = new PurchaseResponse(null);
        assertEquals(purchaseResponse, purchaseResponse1);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse1.hashCode());
    }
}

