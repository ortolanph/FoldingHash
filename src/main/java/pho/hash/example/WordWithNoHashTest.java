package pho.hash.example;

import java.util.HashMap;
import java.util.Map;

public class WordWithNoHashTest {

    private static final Map<WordWithNoHash, String> synonyms = new HashMap<>();

    public static void main(String[] args) {
        //market, later, rather, father, latter, gather, matter, water, target
        WordWithNoHash marketWord = WordWithNoHash.of("market");
        WordWithNoHash laterWord = WordWithNoHash.of("later");
        WordWithNoHash ratherWord = WordWithNoHash.of("rather");
        WordWithNoHash fatherWord = WordWithNoHash.of("father");
        WordWithNoHash latterWord = WordWithNoHash.of("latter");
        WordWithNoHash gatherWord = WordWithNoHash.of("gather");
        WordWithNoHash matterWord = WordWithNoHash.of("matter");
        WordWithNoHash waterWord = WordWithNoHash.of("water");

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
        waterWord = WordWithNoHash.of("water");
        printValues(waterWord);

        System.out.println(synonyms);

        WordWithNoHash test = WordWithNoHash.of("Test");
        System.out.println(test.hashCode());
        test = WordWithNoHash.of("Test");
        System.out.println(test.hashCode());

    }

    private static void printValues(WordWithNoHash word) {
        System.out.printf("%s hash is %d and the value is %s\n",word.toString(), word.hashCode(), synonyms.get(word));
    }
}
