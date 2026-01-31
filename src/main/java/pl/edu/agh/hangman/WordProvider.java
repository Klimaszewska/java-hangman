package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordProvider {
    private final List<String> words;
    private final Random random;

    public WordProvider() {
        this.words = new ArrayList<>();
        this.random = new Random();
    }

    private void readContent() throws IOException {
        words.clear();

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("slowa.txt");
            if (inputStream == null) {
                throw new IOException("Could not find a file to read from");
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim();
                if (!word.isEmpty()) {
                    words.add(word.toUpperCase());
                }
            }
        } catch (IOException exception) {
            throw new IOException("Could not find input to read from.");
        }
    }

    public String selectRandomWord() throws IOException {
        if (words.isEmpty()) {
            readContent();
        }
        return words.get(random.nextInt(words.size()));
    }
}
