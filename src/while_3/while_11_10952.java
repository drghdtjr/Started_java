package while_3;

import java.util.Scanner;

public class while_11_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a != 0 && b != 0) {
                System.out.println(a + b);
            } else {
                break;
            }
        }

    }
}


