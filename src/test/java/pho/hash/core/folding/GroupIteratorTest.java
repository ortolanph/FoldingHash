package pho.hash.core.folding;

import org.junit.jupiter.api.Test;

import java.util.List;

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
    public void iteratingOneSizedString() {
        GroupIterator iterator = new GroupIterator(SAMPLE_1, 2);

        //List<Integer> expected = List.of(65);

    }

}