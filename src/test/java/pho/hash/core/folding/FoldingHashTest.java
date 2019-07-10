package pho.hash.core.folding;

import org.junit.jupiter.api.Test;
import pho.hash.core.Hasher;

import static org.junit.jupiter.api.Assertions.*;

class FoldingHashTest {

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
        Hasher hasher = new FoldingHash(GroupSize.TWO);

        int expected = 65;
        int actual = hasher.calculateHash(SAMPLE_1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample2GroupSize2() {
        Hasher hasher = new FoldingHash(GroupSize.TWO);

        int expected = 6566;
        int actual = hasher.calculateHash(SAMPLE_2);

        assertEquals(expected, actual);
    }

    @Test
    public void sample3GroupSize3() {
        Hasher hasher = new FoldingHash(GroupSize.THREE);

        int expected = 56667;
        int actual = hasher.calculateHash(SAMPLE_3);

        assertEquals(expected, actual);
    }

    @Test
    public void sample3GroupSize2() {
        Hasher hasher = new FoldingHash(GroupSize.TWO);

        int expected = 6633;
        int actual = hasher.calculateHash(SAMPLE_3);

        assertEquals(expected, actual);
    }

    @Test
    public void sample4GrouSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 13334;
        int actual = hasher.calculateHash(SAMPLE_4);

        assertEquals(expected, actual);
    }

    @Test
    public void sample5GrouSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 63536;
        int actual = hasher.calculateHash(SAMPLE_5);

        assertEquals(expected, actual);
    }

    @Test
    public void sample6GrouSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 43637;
        int actual = hasher.calculateHash(SAMPLE_6);

        assertEquals(expected, actual);
    }

    @Test
    public void sample6GrouSize2() {
        Hasher hasher = new FoldingHash(GroupSize.TWO);

        int expected = 20304;
        int actual = hasher.calculateHash(SAMPLE_6);

        assertEquals(expected, actual);
    }

    @Test
    public void sample7GroupSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 20375;
        int actual = hasher.calculateHash(SAMPLE_7);

        assertEquals(expected, actual);
    }

    @Test
    public void sample7GroupSize3() {
        Hasher hasher = new FoldingHash(GroupSize.THREE);

        int expected = 43708;
        int actual = hasher.calculateHash(SAMPLE_7);

        assertEquals(expected, actual);
    }

    @Test
    public void sample8GroupSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 27476;
        int actual = hasher.calculateHash(SAMPLE_8);

        assertEquals(expected, actual);
    }

    @Test
    public void sample9GroupSizeAuto() {
        Hasher hasher = new FoldingHash(GroupSize.AUTO);

        int expected = 60910;
        int actual = hasher.calculateHash(SAMPLE_9);

        assertEquals(expected, actual);
    }

    @Test
    public void sample9GroupSize2() {
        Hasher hasher = new FoldingHash(GroupSize.TWO);

        int expected = 27549;
        int actual = hasher.calculateHash(SAMPLE_9);

        assertEquals(expected, actual);
    }
}