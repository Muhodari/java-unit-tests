package com.example.classbjunit.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class sumServiceImplMockitoTest {

 @InjectMocks
 sumServiceImplem sumServiceImplem;

 @Mock
    private CalculatorService calculatorServiceMockito;

   @Test
   public void Summation(){
when(calculatorServiceMockito.getAll()).thenReturn(new int[]{1,3,5,6,7});
assertEquals(22,sumServiceImplem.calcSumForServiceData());

  }


}
