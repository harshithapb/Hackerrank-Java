package easy;

import java.io.*;
import java.util.*;

public class Solution27 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++)
            list.add(scanner.nextInt());

        int queries = scanner.nextInt();
        for(int i = 0; i < queries; i++) {
            String query = scanner.next();

            int index = scanner.nextInt();
            if (query.equals("Insert")){
                int newValue = scanner.nextInt();
                list.add(index, newValue);
            }
            else
                list.remove(index);
        }

        scanner.close();

        for(Integer num : list)
            System.out.print(num + " ");


    }
}