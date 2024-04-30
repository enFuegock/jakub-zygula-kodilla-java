package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleSecondChallenge(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Handling complete.");
        }
    }
}
