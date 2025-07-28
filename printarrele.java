public class printarrele {

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Call method to print array
        printArray(numbers);
    }
}
