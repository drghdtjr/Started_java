package oneArrange_4;

import java.util.Scanner;

public class one_9_10811 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int m= sc.nextInt();
        int a=0;
        while(a<n){
            arr[a]= a+1;
            a++;
        }
        int z=0;
        while(z<n){
            int i= sc.nextInt();
            int j= sc.nextInt();
            while(i<j)
            z++;
        }

    }
}
