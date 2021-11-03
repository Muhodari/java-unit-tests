package com.example.demo.services;

import org.junit.Test;
import static org.junit.Assert.*;
public class DayOfWeekServiceImpleTest {


    @Test
 public void test_pass(){
        DayOfWeekServiceImpl dayofWeek= new DayOfWeekServiceImpl();
        String result = dayofWeek.getDay(1);
        String expected ="Monday";
        assertEquals(result,expected);
    }

    @Test
    public void getday_invalid(){
        DayOfWeekServiceImpl dayofWeek= new DayOfWeekServiceImpl();
        String result = dayofWeek.getDay(10);
        String expected ="no valid day";
        assertEquals(result,expected);

    }

}
