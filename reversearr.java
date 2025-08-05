public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
