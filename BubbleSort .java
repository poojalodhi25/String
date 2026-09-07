public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 6, 7};

        int n = arr.length;

        print(arr);

        for (int x = 0; x < n - 1; x++) {

            for (int i = 0; i < n - x - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        print(arr);
    }

    static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}