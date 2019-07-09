package pho.hash.core.folding;

import java.io.UnsupportedEncodingException;
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
        int limit = (groupSize > source.length() - offset)?
                source.length() - offset
                : groupSize;

        byte[] tokens = new byte[0];
        try {
            tokens = source.substring(offset, offset + limit).getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String fold = "";

        for(byte token : tokens) {
            fold += (int)token;
        }

        offset += groupSize;

        return Integer.valueOf(fold);
    }

}
