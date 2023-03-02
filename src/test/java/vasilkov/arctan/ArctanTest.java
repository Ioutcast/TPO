package vasilkov.arctan;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import vasilkov.arctg.Arctan;

import java.util.stream.Stream;

import static java.lang.Float.NaN;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArctanTest {
    private final int n = 1000;

    @ParameterizedTest(name = "#{index} - Test with {1}")
    @MethodSource("argumentProvider")
    @DisplayName("Check root parameters")
    void checkSqrtParam(double param, String mes) {
        assertAll(
                () -> Assertions.assertEquals(Math.atan(param), Arctan.calc(param,n),  0.001,mes)
        );
    }
    static Stream<Arguments> argumentProvider() {
        return Stream.of(
                arguments(1/Math.sqrt(3),"  1/sqrt(3)"),
                arguments(-1/Math.sqrt(3),"  1/sqrt(3)")
        );
    }

    @ParameterizedTest(name = "#{index} - arctan({0})")
    @DisplayName("Check Rational Numbers")
    @ValueSource(doubles = {-1, 0,-0.5, -0.342,-0.1,0.1,0.5,0.65434,1})
    void checkRationalNumbers(double param) {
        assertAll(
                () -> assertEquals(Math.atan(param), Arctan.calc(param,n),  0.001)
        );
    }


    @ParameterizedTest(name = "#{index} - arctan({0})")
    @DisplayName("Check NaN")
    @MethodSource("naNArgumentProvider")
    void checkNan(double param) {
        assertAll(
                () -> assertEquals(NaN, Arctan.calc(param,n))
        );
    }
    static Stream<Arguments> naNArgumentProvider() {
        return Stream.of(
                arguments(Math.sqrt(3),"sqrt(3)"),
                arguments(-Math.sqrt(3)," -sqrt(3)"),
                arguments(NaN," NaN"),
                arguments(999," 999"),
                arguments(5," 5")
        );
    }

}
