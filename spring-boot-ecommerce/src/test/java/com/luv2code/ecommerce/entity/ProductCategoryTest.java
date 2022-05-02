package com.luv2code.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ProductCategoryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ProductCategory}
     *   <li>{@link ProductCategory#setCategoryName(String)}
     *   <li>{@link ProductCategory#setId(Long)}
     *   <li>{@link ProductCategory#setProducts(Set)}
     * </ul>
     */
    @Test
    void testConstructor() {
        ProductCategory actualProductCategory = new ProductCategory();
        actualProductCategory.setCategoryName("Category Name");
        actualProductCategory.setId(123L);
        HashSet<Product> productSet = new HashSet<>();
        actualProductCategory.setProducts(productSet);
        assertEquals("Category Name", actualProductCategory.getCategoryName());
        assertEquals(123L, actualProductCategory.getId().longValue());
        assertSame(productSet, actualProductCategory.getProducts());
    }
}

