public class CharArray {

    public static boolean isPalindrome(char[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        char[] arr = {'m', 'a', 'd', 'a', 'm'};

        boolean result = isPalindrome(arr);

        System.out.println(result);
    }
}