package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        List<String> al=new ArrayList<>();
        int counter=1;
        while(sc.hasNext()){
            al.add(counter++ +" "+sc.nextLine());
        }
        for(String s: al){
            System.out.println(s);
        }
    }
}
