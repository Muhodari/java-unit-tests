package com.example.classbjunit.service;

public class sumServiceImplem {

    CalculatorService calcService;

    public  int returnSumOfData(int[] data){
     int sum=0;

     for(int value:data){
         sum += value;
     }

        return sum;
    }

    public int calcSumForServiceData() {
        int sum = 0;
        for (int value : calcService.getAll()) {
            sum += value;
        }
        return sum;
    }


}
