package easy;

import java.util.*;
import java.text.*;

public class Solution12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","in")).format(amount));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
    }
}