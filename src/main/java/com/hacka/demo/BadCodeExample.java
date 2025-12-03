package com.hacka.demo;

import java.util.ArrayList;
import java.util.List;

public class BadCodeExample {
    public void mathCalculation() {
        int x = 10;
        int y = 0;

        // Division by zero
        int result = x / y;

        // Hardcoded values and magic numbers
        for (int i = 0; i < 100; i++) {
            System.out.println("Iteration: " + i);
            if (i == 42) {
                break; // Arbitrary break condition
            }
        }

        // Unused variable
        String unused = "This variable is never used";

        // Poor naming conventions
        int a = 5;
        int b = 10;
        int c = a + b;

        System.out.println("Result: " + c);
    }

    private void listUsualConccurrentError() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (String item : list) {
            if (item.equals("b")) {
                list.remove(item);
            }
        }
    }
}