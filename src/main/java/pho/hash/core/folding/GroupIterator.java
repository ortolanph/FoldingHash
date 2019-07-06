package pho.hash.core.folding;

import java.util.Iterator;

public class GroupIterator implements Iterator<Integer> {

    private String source;
    private int groupSize;

    public GroupIterator(String source, int groupSize) {
        this.source = source;
        this.groupSize = groupSize;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }

}
