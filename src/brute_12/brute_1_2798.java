package brute_12;

import java.util.Scanner;

public class brute_1_2798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr_n[]=new int[n];
        int i=0;
        while(i<n){
            arr_n[i]=sc.nextInt();
            i++;
        }
        int j=0;
        int k=n*(n-1)*(n-2)/3;
        int arr_sum[]=new int[k];
        int a=0;
        while(j<k){
            int z=0;
            while(z<=j){
                arr_sum[a]=arr_n[z]+arr_n[z+1]+arr_n[z+2];
                z++;
            }
            j++;
            a++;

        }

    }
}
