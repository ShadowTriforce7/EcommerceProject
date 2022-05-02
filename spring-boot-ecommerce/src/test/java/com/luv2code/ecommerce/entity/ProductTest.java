package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class ProductTest {
    /**
     * Method under test: {@link Product#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Product()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Product#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Product product = new Product();

        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(3L));
        product1.setUnitsInStock(3);
        assertTrue(product.canEqual(product1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Product}
     *   <li>{@link Product#setAvtive(boolean)}
     *   <li>{@link Product#setCategory(ProductCategory)}
     *   <li>{@link Product#setDateCreated(Date)}
     *   <li>{@link Product#setDescription(String)}
     *   <li>{@link Product#setId(Long)}
     *   <li>{@link Product#setImageUrl(String)}
     *   <li>{@link Product#setLastUpdated(Date)}
     *   <li>{@link Product#setName(String)}
     *   <li>{@link Product#setSku(String)}
     *   <li>{@link Product#setUnitPrice(BigDecimal)}
     *   <li>{@link Product#setUnitsInStock(int)}
     * </ul>
     */
    @Test
    void testConstructor() {
        Product actualProduct = new Product();
        actualProduct.setAvtive(true);
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());
        actualProduct.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualProduct.setDateCreated(fromResult);
        actualProduct.setDescription("The characteristics of someone or something");
        actualProduct.setId(123L);
        actualProduct.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualProduct.setLastUpdated(fromResult1);
        actualProduct.setName("Name");
        actualProduct.setSku("Sku");
        BigDecimal valueOfResult = BigDecimal.valueOf(1L);
        actualProduct.setUnitPrice(valueOfResult);
        actualProduct.setUnitsInStock(1);
        assertSame(productCategory, actualProduct.getCategory());
        assertSame(fromResult, actualProduct.getDateCreated());
        assertEquals("The characteristics of someone or something", actualProduct.getDescription());
        assertEquals(123L, actualProduct.getId().longValue());
        assertEquals("https://example.org/example", actualProduct.getImageUrl());
        assertSame(fromResult1, actualProduct.getLastUpdated());
        assertEquals("Name", actualProduct.getName());
        assertEquals("Sku", actualProduct.getSku());
        BigDecimal expectedUnitPrice = valueOfResult.ONE;
        assertSame(expectedUnitPrice, actualProduct.getUnitPrice());
        assertEquals(1, actualProduct.getUnitsInStock());
        assertTrue(actualProduct.isAvtive());
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);
        assertNotEquals(product, null);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals2() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);
        assertNotEquals(product, "Different type to Product");
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals3() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);
        assertEquals(product, product);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product.hashCode());
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals4() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);

        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setCategoryName("Category Name");
        productCategory1.setId(123L);
        productCategory1.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(1L));
        product1.setUnitsInStock(1);
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals5() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(false);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);

        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setCategoryName("Category Name");
        productCategory1.setId(123L);
        productCategory1.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(1L));
        product1.setUnitsInStock(1);
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals6() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(1L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);

        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setCategoryName("Category Name");
        productCategory1.setId(123L);
        productCategory1.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(1L));
        product1.setUnitsInStock(1);
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals7() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(null);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(1);

        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setCategoryName("Category Name");
        productCategory1.setId(123L);
        productCategory1.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(1L));
        product1.setUnitsInStock(1);
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals8() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("Category Name");
        productCategory.setId(123L);
        productCategory.setProducts(new HashSet<>());

        Product product = new Product();
        product.setAvtive(true);
        product.setCategory(productCategory);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        product.setDescription("The characteristics of someone or something");
        product.setId(123L);
        product.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        product.setName("Name");
        product.setSku("Sku");
        product.setUnitPrice(BigDecimal.valueOf(1L));
        product.setUnitsInStock(3);

        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setCategoryName("Category Name");
        productCategory1.setId(123L);
        productCategory1.setProducts(new HashSet<>());

        Product product1 = new Product();
        product1.setAvtive(true);
        product1.setCategory(productCategory1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setDescription("The characteristics of someone or something");
        product1.setId(123L);
        product1.setImageUrl("https://example.org/example");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        product1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        product1.setName("Name");
        product1.setSku("Sku");
        product1.setUnitPrice(BigDecimal.valueOf(1L));
        product1.setUnitsInStock(1);
        assertNotEquals(product, product1);
    }
}

