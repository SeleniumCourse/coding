package com.jalasoft.selenium.Ariel.shape;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xain on 3/6/2017.
 */
public class RectangleTest {

    private Shape rectangle;

    @Test
    public void calculatePerimeter() throws Exception {
        // Given
        final double base = 3;
        final double height = 2;

        rectangle = new Rectangle(base, height);

        // When
        final double actualPerimeter = rectangle.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * base * height;
        Assert.assertEquals(expectedPerimeter, actualPerimeter, 0);

    }

    @Test
    public void calculateArea() throws Exception {

    }

}