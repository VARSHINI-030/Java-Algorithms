
class matrix {

    public static void searchElement(int[][] arr, int row, int col, int target) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at row " + i + " column " + j);
                    return;
                }
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;
        searchElement(arr, 3, 3, target);

    }
}
