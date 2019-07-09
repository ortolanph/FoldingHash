package pho.hash.core.folding;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class GroupSizeTest {

    @Test
    public void groupsOfTwo() {
        int actual = GroupSize.TWO.calculate(2);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfTwoAnySize() {
        int actual = GroupSize.TWO.calculate(new Random().nextInt());
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfThree() {
        int actual = GroupSize.THREE.calculate(3);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void groupsOfThreeAnySize() {
        int actual = GroupSize.THREE.calculate(new Random().nextInt());
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize1() {
        int actual = GroupSize.AUTO.calculate(1);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize2() {
        int actual = GroupSize.AUTO.calculate(2);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize3() {
        int actual = GroupSize.AUTO.calculate(3);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize4() {
        int actual = GroupSize.AUTO.calculate(4);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize5() {
        int actual = GroupSize.AUTO.calculate(5);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize6() {
        int actual = GroupSize.AUTO.calculate(6);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize7() {
        int actual = GroupSize.AUTO.calculate(7);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize8() {
        int actual = GroupSize.AUTO.calculate(8);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfThreeSize9() {
        int actual = GroupSize.AUTO.calculate(9);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void autoGroupOfTwoSize10() {
        int actual = GroupSize.AUTO.calculate(10);
        int expected = 2;

        assertEquals(expected, actual);
    }

}