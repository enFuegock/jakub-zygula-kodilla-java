package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6: Wprowadzenie to testowania oprogramowania");

        /*
        System.out.println("Moduł 6.2: SimpleUser Test - POCZĄTEK");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Moduł 6.2: SimpleUser Test - KONIEC");
         */

        System.out.println("Moduł 6.2: Zadanie: Pierwszy test jednostkowy - POCZĄTEK");
        Calculator calculator = new Calculator();
        int addResult = 24;
        int subtractResult = 9;
        if(addResult == calculator.add(15, 9)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if(subtractResult == calculator.subtract(24, 15)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Moduł 6.2: Zadanie: Pierwszy test jednostkowy - KONIEC");
    }
}