package pho.hash.core.folding;

import java.util.Iterator;

public class GroupIterator implements Iterator<Integer> {

    private String source;
    private int groupSize;
    private int offset;

    public GroupIterator(String source, int groupSize) {
        this.source = source;
        this.groupSize = groupSize;
    }

    @Override
    public boolean hasNext() {
        return offset < source.length();
    }

    @Override
    public Integer next() {
        return null;
    }

}
