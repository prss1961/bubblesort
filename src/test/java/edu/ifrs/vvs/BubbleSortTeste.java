package edu.ifrs.vvs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTeste {

    private BubbleSort bs;

    @BeforeEach
    public void setup() {
        bs = new BubbleSort();
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Testando array de números positivos")
    public void assertOrderPositiveNumbers() {
        int[] input = {42, 4, 6, 90, 79};
        int[] expectedOutput = {8, 10, 36, 79, 90};
        bs.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    @DisplayName("Testando array de números negativos")
    public void assertOrderNegativeNumbers() {
        int[] input = {-42, -4, -6, -90, -79};
        int[] expectedOutput = {-90, -79, -36, -10, -8};
        bs.sort(input);
        assertTrue(Arrays.equals(expectedOutput, input));
    }
    
}
