package pho.hash.example;

import java.util.HashMap;
import java.util.Map;

public class WordTest {
    private static final Map<Word, String> synonyms = new HashMap<>();

    public static void main(String[] args) {
        //market, later, rather, father, latter, gather, matter, water, target
        Word marketWord = Word.of("market");
        Word laterWord = Word.of("later");
        Word ratherWord = Word.of("rather");
        Word fatherWord = Word.of("father");
        Word latterWord = Word.of("latter");
        Word gatherWord = Word.of("gather");
        Word matterWord = Word.of("matter");
        Word waterWord = Word.of("water");

        synonyms.put(marketWord, "buy");
        synonyms.put(laterWord, "after");
        synonyms.put(ratherWord, "somewhat");
        synonyms.put(fatherWord, "parenthood");
        synonyms.put(latterWord, "hindmost");
        synonyms.put(gatherWord, "assemble");
        synonyms.put(matterWord, "importance");
        synonyms.put(waterWord, "wet");

        printValues(marketWord);
        printValues(laterWord);
        printValues(ratherWord);
        printValues(fatherWord);
        printValues(latterWord);
        printValues(gatherWord);
        printValues(matterWord);
        printValues(waterWord);

        System.out.println(synonyms);
    }

    private static void printValues(Word word) {
        System.out.printf("%s hash is %d and the value is %s\n",word.toString(), word.hashCode(), synonyms.get(word));
    }
}
