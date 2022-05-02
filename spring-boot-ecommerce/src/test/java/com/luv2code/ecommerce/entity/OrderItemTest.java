package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class OrderItemTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link OrderItem}
     *   <li>{@link OrderItem#setId(Long)}
     *   <li>{@link OrderItem#setImageUrl(String)}
     *   <li>{@link OrderItem#setOrder(Order)}
     *   <li>{@link OrderItem#setProductId(Long)}
     *   <li>{@link OrderItem#setQuantity(int)}
     *   <li>{@link OrderItem#setUnitPrice(BigDecimal)}
     * </ul>
     */
    @Test
    void testConstructor() {
        OrderItem actualOrderItem = new OrderItem();
        actualOrderItem.setId(123L);
        actualOrderItem.setImageUrl("https://example.org/example");
        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(new Order());
        address.setState("MD");
        address.setStreet("Street");
        address.setZipCode("21654");
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());
        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(new Order());
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipCode("21654");
        Order order = new Order();
        order.setBillingAddress(address);
        order.setCustomer(customer);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(address1);
        order.setStatus("Status");
        order.setTotalPrice(BigDecimal.valueOf(1L));
        order.setTotalQuantity(1);
        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipCode("21654");
        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());
        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipCode("21654");
        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());
        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipCode("21654");
        Order order1 = new Order();
        order1.setBillingAddress(address3);
        order1.setCustomer(customer2);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(address4);
        order1.setStatus("Status");
        order1.setTotalPrice(BigDecimal.valueOf(1L));
        order1.setTotalQuantity(1);
        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order1);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipCode("21654");
        Order order2 = new Order();
        order2.setBillingAddress(address2);
        order2.setCustomer(customer1);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address5);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(1L));
        order2.setTotalQuantity(1);
        actualOrderItem.setOrder(order2);
        actualOrderItem.setProductId(123L);
        actualOrderItem.setQuantity(1);
        BigDecimal valueOfResult = BigDecimal.valueOf(1L);
        actualOrderItem.setUnitPrice(valueOfResult);
        assertEquals(123L, actualOrderItem.getId().longValue());
        assertEquals("https://example.org/example", actualOrderItem.getImageUrl());
        assertSame(order2, actualOrderItem.getOrder());
        assertEquals(123L, actualOrderItem.getProductId().longValue());
        assertEquals(1, actualOrderItem.getQuantity());
        BigDecimal expectedUnitPrice = valueOfResult.ONE;
        assertSame(expectedUnitPrice, actualOrderItem.getUnitPrice());
    }
}

