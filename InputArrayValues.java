import java.util.Scanner;

public class InputArrayValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the values
        int[] myArray = new int[n];

        // Input values into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Display the array
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Close the scanner
        scanner.close();
    }
}
