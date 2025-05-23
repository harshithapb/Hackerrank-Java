package easy;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution28{
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phone = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline after reading int

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            phone.put(name, number);
        }

        while (scanner.hasNextLine()) {
            String qr = scanner.nextLine();
            if (phone.containsKey(qr)) {
                System.out.println(qr + "=" + phone.get(qr));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}




