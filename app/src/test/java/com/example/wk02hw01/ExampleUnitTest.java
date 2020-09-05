package com.example.wk02hw01;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    ArrayList<User> users = MainActivity.setupUsers();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void verifyLogin() {
        assertEquals(users.get(0).getUsername(), "din_djarin");
        assertEquals(users.get(1).getUsername(), "aye_caasi");
        assertEquals(users.get(2).getUsername(), "acaasi");
        assertEquals(users.get(3).getUsername(), "anakinSkywalker");

        assertEquals(users.get(0).getPassword(), "baby_yoda_ftw");
        assertEquals(users.get(1).getPassword(), "november22");
        assertEquals(users.get(2).getPassword(), "1234");
        assertEquals(users.get(3).getPassword(), "may4");
    }
}