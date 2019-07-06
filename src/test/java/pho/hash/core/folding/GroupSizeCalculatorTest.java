package pho.hash.core.folding;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class GroupSizeCalculatorTest {

    @Test
    public void groupsOfTwo() {
        int actual = GroupSizeCalculator.DOUBLES.calculate(2);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfTwoAnySize() {
        int actual = GroupSizeCalculator.DOUBLES.calculate(new Random().nextInt());
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfThree() {
        int actual = GroupSizeCalculator.TRIPLETS.calculate(3);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfThreeAnySize() {
        int actual = GroupSizeCalculator.TRIPLETS.calculate(new Random().nextInt());
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize1() {
        int actual = GroupSizeCalculator.AUTO.calculate(1);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize2() {
        int actual = GroupSizeCalculator.AUTO.calculate(2);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize3() {
        int actual = GroupSizeCalculator.AUTO.calculate(3);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize4() {
        int actual = GroupSizeCalculator.AUTO.calculate(4);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize5() {
        int actual = GroupSizeCalculator.AUTO.calculate(5);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize6() {
        int actual = GroupSizeCalculator.AUTO.calculate(6);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize7() {
        int actual = GroupSizeCalculator.AUTO.calculate(7);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize8() {
        int actual = GroupSizeCalculator.AUTO.calculate(8);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize9() {
        int actual = GroupSizeCalculator.AUTO.calculate(9);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize10() {
        int actual = GroupSizeCalculator.AUTO.calculate(10);
        int expected = 2;

        assertEquals(expected, actual);
    }

}