package com.example.classbjunit.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumServiveImplemTest {

@Test
public void check_summation(){
    sumServiceImplem sumServiceImplem = new sumServiceImplem();

    int result = sumServiceImplem.returnSumOfData(new int[]{3,4,5,});
    int expectedAnswer= 12;

    assertEquals(expectedAnswer,result);

}




}
