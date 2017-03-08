package com.jalasoft.selenium.giovanny.shape;

import org.junit.Before;

/**
 * Created by xianqe on 3/6/2017.
 */
public class RectangleTest {

    private Shape rectangle;

    @Before
    public void setUp(){

        //Given
        final int base = 2;
        final int altura = 3;
        rectangle = new Rectangle(base, altura);

    }

}