package BubbleSort;

public class BubbleSort {

    /*
        Recebe um vetor numérico, e ordena com Bubble Sort
     */
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    /*
        Cria um vetor numérico e exibe o resultado ordenado
     */
    public int[] printArray(int[] numbers) {

        System.out.println("Vetor antes do BubbleSort");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.println("Vetor depois do  Bubble Sort");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        return numbers;
    }
}