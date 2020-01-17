// Example class for Git exercise
// Do not use library functions for any of these

public class Stuff {

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    // This function was edited by Irina Mukhametzhanova
    static int fib(int n) {
    	int n1 = 1;
	int n2 = 1;
	int number = 1;
	if (n > 2) {
		for (int i = 2; i < n; i++) {
			number = n1 + n2;
			n1 = n2;
			n2 = number;
		}
	}
	return number;
    };

    // Sorts a list of integers from smallest to largest
    // Build your own - don't use a library sorting method
    static int[] sort(int[] a);

    // Returns the number of occurances of each letter (ABCD...) in a given string
    static int[] letterCount(String s);

    // Returns the GCD of two numbers
    // Must use Euclid's algorithm
    static int gcd(int a, int b);

    // Returns all prime factors of a number
    static int[] factorize(int a);

}
