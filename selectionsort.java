
import java.util.Arrays;

class selectionsort {

    public static int[] selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12, 43, 10, 76, 54, 32};
        int[] sortedArr = selectionsort(arr);
        System.out.print(Arrays.toString(sortedArr));
    }
}
