package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        System.out.println("Sum: " + result);
    }
}