package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    private String playerName;
    private int roundsToWin;
    private int playerWins;
    private int computerWins;
    private Scanner scanner;
    private Random random;

    public RPSGame() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void start() {
        System.out.print("Podaj swoje imię: ");
        playerName = scanner.nextLine();
        System.out.print("Podaj liczbę rund do wygrania: ");
        roundsToWin = scanner.nextInt();

        printInstructions();
        playRounds();
    }

    private void printInstructions() {
        System.out.println("Instrukcja:");
        System.out.println("1 - zagranie 'kamień'");
        System.out.println("2 - zagranie 'papier'");
        System.out.println("3 - zagranie 'nożyce'");
        System.out.println("x - zakończenie gry");
        System.out.println("n - rozpoczęcie nowej gry");
    }

    private void playRounds() {
        while (playerWins < roundsToWin && computerWins < roundsToWin) {
            System.out.print("Twój ruch: ");
            int playerMove = scanner.nextInt();
            int computerMove = random.nextInt(3) + 1;

            System.out.println("Ruch komputera: " + moveToString(computerMove));

            int result = getResult(playerMove, computerMove);
            if (result == 1) {
                playerWins++;
                System.out.println("Wygrałeś rundę!");
            } else if (result == -1) {
                computerWins++;
                System.out.println("Komputer wygrał rundę.");
            } else {
                System.out.println("Remis w rundzie.");
            }

            System.out.println("Wynik: " + playerName + " - " + playerWins + ", Komputer - " + computerWins);
        }

        if (playerWins >= roundsToWin) {
            System.out.println("Gratulacje, wygrałeś grę!");
        } else {
            System.out.println("Niestety, komputer wygrał grę.");
        }

        askForNewGame();
    }

    private int getResult(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            return 0;
        } else if ((playerMove == 1 && computerMove == 3) ||
                (playerMove == 2 && computerMove == 1) ||
                (playerMove == 3 && computerMove == 2)) {
            return 1;
        } else {
            return -1;
        }
    }

    private String moveToString(int move) {
        switch (move) {
            case 1:
                return "kamień";
            case 2:
                return "papier";
            case 3:
                return "nożyce";
            default:
                return "";
        }
    }

    private void askForNewGame() {
        System.out.print("Czy na pewno zakończyć grę? (x/n): ");
        String choice = scanner.next();
        if (choice.equals("n")) {
            resetGame();
            start();
        } else {
            System.out.println("Do widzenia!");
        }
    }

    private void resetGame() {
        playerWins = 0;
        computerWins = 0;
    }

}