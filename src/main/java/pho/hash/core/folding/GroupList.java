package pho.hash.core.folding;

import java.util.Iterator;

public class GroupList implements Iterable<Integer> {

    private Iterator groupIterator;

    public GroupList(String source, GroupSizeCalculator groupSize) {
        groupIterator = new GroupIterator(source, groupSize.calculate(source.length()));
    }

    @Override
    public Iterator<Integer> iterator() {
        return groupIterator;
    }
}