package pho.hash.example;

import pho.hash.core.Hasher;
import pho.hash.core.folding.FoldingHash;
import pho.hash.core.folding.GroupSize;

import java.util.Objects;

public class Word {

    private String word;

    private Word(String word) {
        this.word = word;
    }

    public static Word of(String word) {
        return new Word(word);
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return new FoldingHash(GroupSize.AUTO).calculateHash(word);
    }
}
