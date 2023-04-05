package OOPS;

import java.util.Arrays;

public class AlphabetSorter {
    public static void main(String[] args) {
        char[] alphabets = {'e', 'a', 'y', 'Z', 'M', 'D'};
        int m = 3; // number of lowercase alphabets
        int n = 3; // number of uppercase alphabets

        // Sort lowercase alphabets in ascending order
        Arrays.sort(alphabets, 0, m);

        // Sort uppercase alphabets in descending order
        Arrays.sort(alphabets, m, m + n);
        for (int i = m; i < (m + n) / 2; i++) {
            char temp = alphabets[i];
            alphabets[i] = alphabets[m + n - 1 - i];
            alphabets[m + n - 1 - i] = temp;
        }

        // Print the sorted array
        for (char c : alphabets) {
            System.out.print(c + " ");
        }
    }
}

