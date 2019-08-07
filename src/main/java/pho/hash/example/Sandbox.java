package pho.hash.example;

import pho.hash.core.Hasher;
import pho.hash.core.folding.FoldingHash;
import pho.hash.core.folding.GroupSize;

public class Sandbox {

    public static void main(String[] args) {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        System.out.println(hasher.calculateHash("hello"));
        System.out.println(hasher.calculateHash("light"));
    }

}
