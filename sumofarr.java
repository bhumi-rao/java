import java.util.Scanner;

public class sumofarr {

    // Method to calculate sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int total = calculateSum(numbers);
        System.out.println("Sum of array elements: " + total);
    }
}
