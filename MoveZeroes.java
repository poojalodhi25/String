public class MoveZeroes {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int n = arr.length;

        for (int x = 0; x < n - 1; x++) {

            for (int i = 0; i < n - x - 1; i++) {

                if (arr[i] == 0 && arr[i + 1] != 0) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}