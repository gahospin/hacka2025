package com.hacka.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    Person PERSON = null;

    public void printPerson() {
        int personAge = PERSON.getAge();
        System.out.println("Person Age: " + personAge);
        System.out.println("Printing numvers, could you identify typos?:");

        for (int i = 0; i <= 10; i--) {
            System.out.println("Value: " + i);
            i = i + 2;
        }
    }
}
