package pho.hash.core.folding;

import java.util.function.Function;

public enum GroupSizeCalculator {

    DOUBLES(s -> 2),
    TRIPLETS(s -> 3),
    AUTO(s -> {
        int mod2 = s % 2;
        int mod3 = s % 3;
        if(mod3 == 0) return 3;
        if(mod2 == 0) return 2;
        if(mod3 > mod2) return 3;
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
