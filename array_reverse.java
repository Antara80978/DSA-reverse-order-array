import java.util.Scanner;

public class array_reverse {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        // Fill the temporary array in reverse order
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
