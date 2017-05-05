package com.jalasoft.selenium.dmoreno.movies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class MovieTest {

    /**
     *
     */
    @Test
    public void getTitleTest() {
        final String expectedMovieTitle = "Test Title 001";

        Movie movie = new Movie(expectedMovieTitle);

        assertEquals(expectedMovieTitle, movie.getTitle());
    }
}
