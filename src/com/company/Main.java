package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {58.5, 67.7, -15.8, 67.8, -89.7, 73.7, 12.5, -1.5, 89.9, 54.3, -34.4, 73.3, 67.6, 99.9, 90.1};
        double average = 0;
        for (double digit : numbers) {
            average += digit;

        }
        System.out.println(average / numbers.length);


    }


}