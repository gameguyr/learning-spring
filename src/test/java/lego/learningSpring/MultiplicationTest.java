package lego.learningSpring;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    private final Multiplication addition = new Multiplication();
    @Test
    public void shouldMatchOperation() {
        assert(addition.handles('*'));
        assert(!addition.handles('/'));
    }
    @Test
    public void shouldCorrectlyApplyFormula() {
        assert(addition.apply(2, 2) == 4);
        assert(addition.apply(12, 10) == 120);
    }
}
