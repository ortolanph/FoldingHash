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


}