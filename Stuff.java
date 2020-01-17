// Example class for Git exercise
// Do not use library functions for any of these

public class Stuff {

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    static int fib(int n);

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
    static int gcd(int a, int b);

    // Returns all prime factors of a number
    static int[] factorize(int a);

}
