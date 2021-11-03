package com.example.demo.services;

import com.example.demo.Interface.CalculatorService;

public class ClassBCalaculatorServiceImpl {


    CalculatorService calcService;

    public int calcSum(int[] data){
        int sum = 0;
        for(int value:data){
            sum += value;
        }
        return  sum;
    }



    public void setCalcService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    public int calcSumForServiceData() {
        int sum = 0;
        for (int value : calcService.getAll()) {
            sum += value;
        }
        return sum;
    }


}
