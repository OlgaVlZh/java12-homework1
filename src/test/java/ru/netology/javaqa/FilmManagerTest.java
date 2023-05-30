package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    String film1 = "Movie 1";
    String film2 = "Movie 2";
    String film3 = "Movie 3";
    String film4 = "Movie 4";
    String film5 = "Movie 5";
    String film6 = "Movie 6";
    String film7 = "Movie 7";
    String film8 = "Movie 8";
    String film9 = "Movie 9";
    String film10 = "Movie 10";
    String film11 = "Movie 11";

    @Test
    public void allFilmTest() {

        FilmManager manager = new FilmManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmLimitTest() {

        FilmManager manager = new FilmManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmOverLimitTest() {

        FilmManager manager = new FilmManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);
        manager.addFilms(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmLowLimitTest() {

        FilmManager manager = new FilmManager(1);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmMiddleLimitTest() {

        FilmManager manager = new FilmManager(5);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmHighLimitTest() {
        FilmManager manager = new FilmManager(9);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }
}
