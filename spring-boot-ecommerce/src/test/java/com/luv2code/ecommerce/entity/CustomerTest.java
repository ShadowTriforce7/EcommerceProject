package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class CustomerTest {
    /**
     * Method under test: {@link Customer#add(Order)}
     */
    @Test
    void testAdd() {
        Customer customer = new Customer();

        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipCode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipCode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer1);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(1L));
        order2.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipCode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Order order3 = new Order();
        order3.setBillingAddress(new Address());
        order3.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(new Address());
        order3.setStatus("Status");
        order3.setTotalPrice(null);
        order3.setTotalQuantity(1);

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(order3);
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipCode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Order order4 = new Order();
        order4.setBillingAddress(new Address());
        order4.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(new Address());
        order4.setStatus("Status");
        order4.setTotalPrice(null);
        order4.setTotalQuantity(1);

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(order4);
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipCode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address3);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address4);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(1L));
        order5.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order5);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipCode("21654");

        Order order6 = new Order();
        order6.setBillingAddress(address2);
        order6.setCustomer(customer2);
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(address5);
        order6.setStatus("Status");
        order6.setTotalPrice(BigDecimal.valueOf(1L));
        order6.setTotalQuantity(1);
        customer.add(order6);
        Customer customer4 = order6.getCustomer();
        assertSame(customer, customer4);
        assertEquals(1, customer4.getOrders().size());
    }

    /**
     * Method under test: {@link Customer#add(Order)}
     */
    @Test
    void testAdd2() {
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());
        customer.add(null);
        assertEquals("jane.doe@example.org", customer.getEmail());
        assertTrue(customer.getOrders().isEmpty());
        assertEquals("Doe", customer.getLastName());
        assertEquals(123L, customer.getId().longValue());
        assertEquals("Jane", customer.getFirstName());
    }
}

