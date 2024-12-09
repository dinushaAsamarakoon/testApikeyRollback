package com.testApiKeyRollback.testApiKeyRollback;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void keystore(){
        String apiKey = "***REMOVED***";
        String password = "***REMOVED***";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public String greetUser(String name) {
        return "Hello, " + name + "!";
    }
}
