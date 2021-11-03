package com.example.demo.services;

import com.example.demo.Interface.CalculatorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassBCalculatorServiceImplStubTest {

class CalculatorServiceManyElements implements CalculatorService{
    @Override
    public int[] getAll() {
        return new int[]{1,2,4};
    }
}


    class CalculatorServiceEmptyElements implements CalculatorService{
        @Override
        public int[] getAll() {
            return new int[]{};
        }
    }


    class CalculatorServiceOneElements implements CalculatorService{
        @Override
        public int[] getAll() {
            return new int[]{4};
        }
    }




    @Test
    public void calcSum_manyElement() {
        ClassBCalaculatorServiceImpl calcServiceImpl = new ClassBCalaculatorServiceImpl();

        calcServiceImpl.setCalcService(new CalculatorServiceManyElements());

        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }


	@Test
	public void calcSum_emptyList() {
		ClassBCalaculatorServiceImpl calcServiceImpl = new ClassBCalaculatorServiceImpl();

        calcServiceImpl.setCalcService(new CalculatorServiceEmptyElements());

        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
	}



	 @Test
	public void calcSum_oneElement() {
         ClassBCalaculatorServiceImpl calcServiceImpl = new ClassBCalaculatorServiceImpl();

         calcServiceImpl.setCalcService(new CalculatorServiceOneElements());

         int actualResult = calcServiceImpl.calcSumForServiceData();
         int expectedResult = 4;
         assertEquals(expectedResult, actualResult);
	}




}
