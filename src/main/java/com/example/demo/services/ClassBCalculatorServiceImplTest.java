package com.example.demo.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassBCalculatorServiceImplTest {


    @Test
    public void calcSum_emptyList() {
        ClassBCalaculatorServiceImpl calcServiceImpl = new ClassBCalaculatorServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void calcSum_oneElement() {
      ClassBCalaculatorServiceImpl calcServiceImpl = new ClassBCalaculatorServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {4});
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }





}
