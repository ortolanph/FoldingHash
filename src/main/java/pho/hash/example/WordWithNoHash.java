package pho.hash.example;

import java.util.Objects;

public class WordWithNoHash {

    private String word;

    private WordWithNoHash(String word) {
        this.word = word;
    }

    public static WordWithNoHash of(String word) {
        return new WordWithNoHash(word);
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordWithNoHash that = (WordWithNoHash) o;
        return Objects.equals(word, that.word);
    }

}
