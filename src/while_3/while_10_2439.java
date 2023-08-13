package while_3;

import java.util.Scanner;

public class while_10_2439 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int gap=n;
            while(gap>i){
                System.out.print(" ");
                gap--;
            }

            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
