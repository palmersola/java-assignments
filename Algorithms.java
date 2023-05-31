import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] arrOne = {4, 1, 3, 9, 7};
        int[] arrTwo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //Bubble sort
        bubbleSort(arrOne, arrOne.length);
        bubbleSort(arrTwo, arrTwo.length);

        //Quick sort
        quickSort(arrOne, 0, arrOne.length - 1);
        quickSort(arrTwo, 0, arrTwo.length -1);
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));


    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int sort = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }


}
