import java.util.*;

public class BlockSwap {
    public static void blockswap(int[] arr, int d) {
        System.out.println("Before: " + Arrays.toString(arr));
        if (d == 0 || d == arr.length) return;

        reverse(arr, 0, d - 1);          // Reverse first block
        reverse(arr, d, arr.length - 1); // Reverse second block
        reverse(arr, 0, arr.length - 1); // Reverse whole array

        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int l, int h) {
        for (int i = l; i <= (l + h) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[h - (i - l)];
            arr[h - (i - l)] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        blockswap(arr, 2);
    }
}
