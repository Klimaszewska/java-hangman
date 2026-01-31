package pl.edu.agh.hangman;

import java.util.List;

public class HangmanWindow {
    private String[] HANGMANPICS;
    private String actualPic;
    private int actualLevel = 0;


    public HangmanWindow(String[] HANGMANPICS) {
        this.HANGMANPICS = HANGMANPICS;
    }

    public void printWindow() {
        System.out.println(actualPic);
    }

    public void updateHangman(List<Integer> listOfPosition) {

        if (listOfPosition.size() == 0) {
            actualPic = HANGMANPICS[actualLevel + 1];

        }
        if (actualLevel == HANGMANPICS.length - 1) {
            System.out.println("KONIEC GRY");

        }
    }


}
