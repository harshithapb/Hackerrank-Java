package easy;

import java.util.Scanner;

public class Solution17 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        char[] charA=a.toLowerCase().toCharArray();
        char[] charB=b.toLowerCase().toCharArray();

        java.util.Arrays.sort(charA);
        java.util.Arrays.sort(charB);

        return java.util.Arrays.equals(charA, charB);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}