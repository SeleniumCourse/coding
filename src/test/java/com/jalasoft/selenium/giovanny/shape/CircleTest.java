package com.jalasoft.selenium.giovanny.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xianqe on 3/6/2017.
 */
public class CircleTest {

    private static final int DELTA = 10;

    private Shape circle;

    @Before
    public void setUp(){
        //Given
        final int radio = 5;
        circle = new Circle(radio);
    }

    @Test
    public void testCalculateAreaWhen(){

        //When
        final double actualArea = circle.calculateArea();


        //Then
        final double expectedArea = 10;
        Assert.assertEquals(expectedArea, actualArea, DELTA);

    }

    @Test
    public void test_calculatePerimeter_when(){

        //When
        final double actualPerimeter = circle.calculatePerimeter();


        //Then
        final double expectedPerimeter = 10;
        Assert.assertEquals(expectedPerimeter, actualPerimeter, DELTA);
        Assert.assertEquals();

    }
}