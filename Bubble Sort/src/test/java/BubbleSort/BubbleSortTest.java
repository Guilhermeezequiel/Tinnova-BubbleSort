package BubbleSort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private final BubbleSort sort = new BubbleSort();

    @Test
    void bubbleSortExample() {
        int[] arr = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7 }; //Sequência esperada
        final int[] actual = sort.printArray(arr);
        assertThat(actual).isEqualTo(expected);
    }
}