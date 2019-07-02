package pho.hash.core.folding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupSizeCalculatorTest {

    private static final String BASE_STRING = "ANy STRING";

    @Test
    public void groupsOfTwo() {
        int actual = GroupSizeCalculator.DOUBLES.calculate(BASE_STRING.length());
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfThree() {
        int actual = GroupSizeCalculator.TRIPLETS.calculate(BASE_STRING.length());
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupsOfTwo() {
        int actual = 2;
        int expected = 2;

        assertEquals(expected, actual);
    }

}