package pho.hash.example;

import pho.hash.core.Hasher;
import pho.hash.core.folding.FoldingHash;
import pho.hash.core.folding.GroupSize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class WordCount {

    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Paths.get("words.txt"));
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        Map<Integer, Set<String>> categorizedWords = words
                .stream()
                .collect(groupingBy(String::length, toSet()));

        System.out.println(categorizedWords.keySet().size());
        categorizedWords
                .keySet()
                .forEach(s -> System.out.printf("%d words with %d characters\n", categorizedWords.get(s).size(), s));

        System.out.println("------------------------------------------------------------------------------------");

        Map<Integer, Set<String>> hashedWords = words
                .stream()
                .collect(groupingBy(x ->hasher.calculateHash(x), toSet()));

        System.out.println(hashedWords.keySet().size());
        hashedWords
                .values()
                .stream()
                .filter(c -> c.size() > 3)
                .forEach(s -> System.out.printf("%d words with the same hash %s\n", s.size(), s));
    }
}
