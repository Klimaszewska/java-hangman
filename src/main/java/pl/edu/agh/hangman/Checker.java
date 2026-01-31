package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;

public class Checker {

    public List<Integer> check(char letter, String selectedWord) {
        if (selectedWord == null) {
            throw new IllegalArgumentException("selectedWord nie moze byc nullem");
        }

        List<Integer> listOfPosition = new ArrayList<>();





        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == letter) {
                listOfPosition.add(i);
            }
        }

        return listOfPosition;
    }
}
