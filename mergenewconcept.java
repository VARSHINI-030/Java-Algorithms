public class mergenewconcept {
    static void split(int arr[], int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            split(arr, left, mid);      
            split(arr, mid + 1, right); 
            merge(arr, left, mid, right);
        }
    }
    static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right) {
            if(arr[i] < arr[j]) { 
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= right) {
            temp[k++] = arr[j++];
        }
        for(i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        split(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}