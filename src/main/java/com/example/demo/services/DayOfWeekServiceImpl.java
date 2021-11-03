package com.example.demo.services;

public class DayOfWeekServiceImpl {



    public String getDay(int number){
        switch (number){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "thursday";
            case 5:
                return "Friday";
            case 6:
                return "saturday";
            case 7:
                return  "sunday";
            default:
                return "no valid day";
        }

    }





}
