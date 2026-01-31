package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static pl.edu.agh.hangman.Hangman.HANGMANPICS;

public class Executor {
    String selectedWord;
    HangmanWindow hangmanWindow;
    LetterWindow letterWindow;
    Checker checker;
    WordProvider provider;
    char letter;
    Scanner input = new Scanner(System.in);



    public void run() throws IOException {

        hangmanWindow = new HangmanWindow(HANGMANPICS);
        letterWindow = new LetterWindow();
        checker = new Checker();
        provider = new WordProvider();


        selectedWord = provider.selectRandomWord();

        System.out.println("Welcome to the Hangman");

        while (true) {
            System.out.println("Proszę podać literę");
            letter = input.nextLine().charAt(0);
            List<Integer> listOfPosition = checker.check(letter,selectedWord);
            hangmanWindow.printWindow(listOfPosition);
letterWindow.printWindow(selectedWord,listOfPosition);

            if(hangmanWindow.endGame()) {
                break;
            };
        }
    }
}
