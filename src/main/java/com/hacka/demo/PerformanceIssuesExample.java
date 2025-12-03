package com.hacka.demo;

import java.util.ArrayList;
import java.util.List;

public class PerformanceIssuesExample {
    public static void main(String[] args) {
        // Inefficient string concatenation in a loop
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += i; // Creates a new String object on each iteration
        }
        System.out.println(result);

        // Inefficient list resizing
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i); // Frequent resizing of the internal array
        }

        // Nested loops with high time complexity
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.println("Processing: " + i + ", " + j); // O(n^2) complexity
            }
        }
    }
}