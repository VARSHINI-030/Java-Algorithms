
import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};

        int mid = arr.length / 2;

        int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
        int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[arr.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(result));
    }
}
