import java.util.Arrays;

public class sortarr {
    public static void main(String[] args) {
        int[] arr = {25, 10, 5, 30, 15};
        Arrays.sort(arr);  // built-in sort

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

