package com.kodilla.testing.calculator;

public class TestingMain {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(99, 88);
        int resultSub = calculator.subtract(197, 102);
        if (resultAdd == 187 && resultSub == 95) {
            System.out.println("OK, Calculator test passed!");
        } else {
            System.out.println("Calculator test failed!");
        }
    }

}
