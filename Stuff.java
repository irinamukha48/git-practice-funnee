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
   // Alison worked on this
     static int[] letterCount(String s)
{
    String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int[] count = new int[26];
    for (int i = 0; i < s.size(); i++) {
        String char1 = s.substring(i,i+1);
        for (int j = 0; j < abc.length; j++) {
            if (abc[j].equals(char1)) count[j]++;
    }
    }
    return count;
}

    // Returns the GCD of two numbers
    // Must use Euclid's algorithm
    static int gcd(int a, int b) {
        int X, Y;
        if (a < b) { // A is bigger, B is smaller
            X = a;
            Y = b;
        } else {
            X = a;
            Y = b;
        }
        if (Y == 0) return X;
        else return gcd(Y, X % Y);
    }

    // Returns all prime factors of a number
    static int[] factorize(int a);

	for(int i = 2; i< a; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(a >2) {
         System.out.println(a);
      } 


}
