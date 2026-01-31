package pl.edu.agh.hangman;

import java.util.List;

public class HangmanWindow {
    private String[] HANGMANPICS;
    private String actualPic;
    private int actualLevel = 0;


    public HangmanWindow(String[] HANGMANPICS) {
        this.HANGMANPICS = HANGMANPICS;
    }

    public void printWindow(List<Integer> listOfPosition) {
        updateHangman(listOfPosition);
        System.out.println(actualPic);
    }

    private void updateHangman(List<Integer> listOfPosition) {

        if (listOfPosition.size() == 0) {
            actualLevel = actualLevel+1;
            this.actualPic = HANGMANPICS[actualLevel];

        }

    }
    public boolean endGame() {
        if (actualLevel == HANGMANPICS.length - 1) {
            return true;
        } else  {
            return false;
        }
    }


}
