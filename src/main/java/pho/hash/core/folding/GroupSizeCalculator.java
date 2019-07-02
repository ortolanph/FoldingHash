package pho.hash.core.folding;

import java.util.function.Function;

public enum GroupSizeCalculator {

    DOUBLES(s -> 2),
    TRIPLETS(s -> 3),
    AUTO(s -> {
        if(s % 2 == 0) return 2;
        if(s % 3 == 0) return 3;
        if(s % 3 == 2) return 3;
        return 2;
    });

    private Function<Integer, Integer> calculator;

    GroupSizeCalculator(Function<Integer, Integer> calculator) {
        this.calculator = calculator;
    }

    public Integer calculate(Integer size) {
        return calculator.apply(size);
    }

}
