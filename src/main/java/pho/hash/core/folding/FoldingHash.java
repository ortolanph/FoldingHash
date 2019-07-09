package pho.hash.core.folding;

import pho.hash.core.Hasher;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FoldingHash implements Hasher {

    private GroupSize groupSize;

    private static final Integer BASE = 10;
    private static final Integer POWER = 5;

    public FoldingHash(GroupSize groupSize) {
        this.groupSize = groupSize;
    }

    @Override
    public int calculateHash(String string) {
        GroupList numberList = new GroupList(string, groupSize);
        List<Integer> numbers = StreamSupport.stream(numberList.spliterator(), false).collect(Collectors.toList());
        Integer sum = numbers.stream().reduce((x, y) -> x + y).get();

        return (int)(sum % Math.pow(BASE, POWER));
    }

}
