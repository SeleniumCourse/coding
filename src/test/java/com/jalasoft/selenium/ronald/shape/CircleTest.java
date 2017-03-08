package com.jala.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author bsronald on 3/3/17.
 */
public class CircleTest {

    private static final float DELTA = 0;
    private AbstractFigure circulo;

    @Before
    public void setUp() {

        //Given
        final float radio = 5;
        circulo = new Circulo(radio);
    }

    @Test
    public void testAreaCirculo(){

        // When
        final float ActualArea = circulo.calculateArea();

        // Then
        final float expectedArea = (float) 78.53982;
        assertEquals(expectedArea, ActualArea, DELTA);

    }

    @Test
    public void testPerimetroCirculo(){

        // When
        final float ActualPerimetro = circulo.calculatePerimetro();

        // Then
        final float expectedArea = (float) 31.415926;
        assertEquals(expectedArea, ActualPerimetro, DELTA);

    }

}
