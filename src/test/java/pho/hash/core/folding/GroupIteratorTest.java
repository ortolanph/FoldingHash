package pho.hash.core.folding;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

public class GroupIteratorTest {

    private static final String SAMPLE_1 = "A";
    private static final String SAMPLE_2 = "AB";
    private static final String SAMPLE_3 = "ABC";
    private static final String SAMPLE_4 = "ABCD";
    private static final String SAMPLE_5 = "ABCDE";
    private static final String SAMPLE_6 = "ABCDEF";
    private static final String SAMPLE_7 = "ABCDEFG";
    private static final String SAMPLE_8 = "ABCDEFGH";
    private static final String SAMPLE_9 = "ABCDEFGHI";

    @Test
    public void sample1GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_1, GroupSize.TWO);

        List<Integer> expected = List.of(65);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);

    }

    @Test
    public void sample2GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_2, GroupSize.TWO);

        List<Integer> expected = List.of(6566);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample3GroupSize3() {
        GroupList groupList = new GroupList(SAMPLE_3, GroupSize.THREE);

        List<Integer> expected = List.of(656667);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample3GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_3, GroupSize.TWO);

        List<Integer> expected = List.of(6566,67);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample4GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_4, GroupSize.TWO);

        List<Integer> expected = List.of(6566,6768);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample5GroupSize3() {
        GroupList groupList = new GroupList(SAMPLE_5, GroupSize.THREE);

        List<Integer> expected = List.of(656667,6869);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample6GroupSize3() {
        GroupList groupList = new GroupList(SAMPLE_6, GroupSize.THREE);

        List<Integer> expected = List.of(656667,686970);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample7GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_7, GroupSize.TWO);

        List<Integer> expected = List.of(6566,6768,6970,71);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample7GroupSize3() {
        GroupList groupList = new GroupList(SAMPLE_7, GroupSize.THREE);

        List<Integer> expected = List.of(656667,686970,71);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample8GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_8, GroupSize.TWO);

        List<Integer> expected = List.of(6566,6768,6970,7172);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample9GroupSizeAuto() {
        GroupList groupList = new GroupList(SAMPLE_9, GroupSize.AUTO);

        List<Integer> expected = List.of(656667,686970,717273);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample9GroupSize3() {
        GroupList groupList = new GroupList(SAMPLE_9, GroupSize.THREE);

        List<Integer> expected = List.of(656667,686970,717273);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    @Test
    public void sample9GroupSize2() {
        GroupList groupList = new GroupList(SAMPLE_9, GroupSize.TWO);

        List<Integer> expected = List.of(6566,6768,6970,7172,73);
        List<Integer> actual = createList(groupList);

        assertEquals(expected, actual);
    }

    private List<Integer> createList(Iterable iterable) {
        return (List<Integer>) StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }

}