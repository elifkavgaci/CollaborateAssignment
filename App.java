import java.util.Random;
import java.util.Scanner;

public class App {



    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array: ");

        // Read the number of elements from the user
        int n = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] array = new int[n];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Fill the array with random integers between 0 and 100
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }

        int choice;
        do {
            // Display the menu options to the user
            System.out.println("\nMenu:");
            System.out.println("1. Finding the maximum and minimum values in the array.");
            System.out.println("2. Display how each element of the array differs from the average.");
            System.out.println("3. Find the sum of elements with odd- and even-numbered indexes.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice (1-4): ");

            // Read the user's choice
            choice = scanner.nextInt();

            if (choice == 1) {
                // Implementation for finding max and min values
            } else if (choice == 2) {
                // Implementation for displaying differences from average
            } else if (choice == 3) {
                // Implementation for finding sum of elements with odd and even indexes
                findSums(array);
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while(choice != 4);

    }
    public static void findSums(int[]arr){
            int even = 0;
            int odd = 0;
            for(int i = 0; i < arr.length; i++){
                if (i % 2 == 0) {
                    even += arr[i];
                }else{
                    odd += arr[i];
                }
            }
            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
        }

    public static void FindDiffArr(int[] arr){
        //first find the average
        int sum = 0;
        int avg = 0;
        for(int i = 0 ; i< arr.length;i++){
            sum += arr[i];
        }

        avg = (sum / arr.length);

        int[] differences = new int[arr.length];

        for(int i = 0; i < differences.length; i++){
            differences[i] = arr[i] - avg;
        }

        System.out.print("{");
        for(int i = 0; i < differences.length; i++){
            System.out.print(differences[i]);
            if(i != differences.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}

    
