class binary{
    public static int BinarySearch(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                return mid;
            }

            if (arr[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int element = 10;
        int result = BinarySearch(arr, element);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}