package pho.hash.core.folding;

public class GroupList implements Iterable<Integer> {

    private Iterator groupIterator;

    public GroupList(String source, int groupSize) {
        groupIterator = new GroupIterator(source, groupSize);
    }

    @Override
    public Iterator<Integer> iterartor() {
        return groupIterator;
    }
}