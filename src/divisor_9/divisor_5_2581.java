package divisor_9;

import java.util.Scanner;

public class divisor_5_2581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int arr[]=new int[n-m];
        int sum=0;
        int min=1;
        while(m<n){
            int j=2;
            int a=0;
            while(j<=m){
                if(j==m){
                    arr[a]=m;
                    a++;
                }
                if(m%j==0){
                    break;
                }
                j++;
            }
            m++;
        }
        int k=0;
        while(k<arr.length){
            System.out.println(arr[k]);
        k++;
        }
    }
}
