package pl.edu.agh.hangman;

import java.util.List;
import java.util.Scanner;

import static pl.edu.agh.hangman.Hangman.HANGMANPICS;

public class Executor {
    String selectedWord;
    HangmanWindow hangmanWindow;
    LetterWindow letterWindow;
    Checker checker;

    public void run() {

        hangmanWindow = new HangmanWindow(HANGMANPICS);
        letterWindow = new LetterWindow();
        checker = new Checker();

        String letter;
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Hangman");

        while (true) {
            System.out.println("Proszę podać literę");
            letter = input.nextLine();
            List<Integer> listOfPosition = checker.check(letter);
            hangmanWindow.printWindow(listOfPosition);

        }
    }
}
