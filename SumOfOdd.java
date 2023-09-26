/*.WAP to find the sum of the odd numbers between 7 to 21 using for loop.
 * Display the odd numbers and print the sum as an output.
 */
package Java;

public class SumOfOdd {
	public static void main(String[] args) {
        int start = 7;
        int end = 21;
        int sum = 0;

        System.out.println("Odd numbers between 7 and 21:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { 	// it's checking if the number is odd
                System.out.print(i + " ");
                sum =sum + i; 	// Add the odd number to the sum
            }
        }

        System.out.println("\nSum of odd numbers: " + sum);
    }
}

package Java;

public class SumOfOdd {
	public static void main(String[] args) {
        int start = 7;
        int end = 21;
        int sum = 0;

        System.out.println("Odd numbers between 7 and 21:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { 	// it's checking if the number is odd
                System.out.print(i + " ");
                sum =sum + i; 	// Add the odd number to the sum
            }
        }

        System.out.println("\nSum of odd numbers: " + sum);
    }
}
