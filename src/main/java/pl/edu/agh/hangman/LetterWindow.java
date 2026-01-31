package pl.edu.agh.hangman;

import java.util.List;

public class LetterWindow {
    private String selectedWord;
    private List<Integer> listOfPosition;
    private StringBuilder guessWord;

    public LetterWindow() {}

    public void setSelectedWord(String selectedWord) {
        if (selectedWord == null) {
            throw new IllegalArgumentException("selectedWord nie moze byc nullem");
        }
        this.selectedWord = selectedWord;
        this.guessWord = new StringBuilder("-".repeat(selectedWord.length()));
    }

    public void setListOfPosition(List<Integer> listOfPosition) {
        this.listOfPosition = listOfPosition;
    }

    public String showLetters(char letter) {
        if (guessWord == null) {
            throw new IllegalStateException("Najpierw ustaw selectedWord");
        }

        if (this.listOfPosition != null) {
            for (Integer pos : this.listOfPosition) {
                if (pos != null && pos >= 0 && pos < guessWord.length()) {
                    guessWord.setCharAt(pos, letter);
                }
            }
        }
        return guessWord.toString();
    }

    public String getGuessWord() {
        return guessWord == null ? "" : guessWord.toString();
    }


}
