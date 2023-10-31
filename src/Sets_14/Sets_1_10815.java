package Sets_14;

import java.util.Arrays;
import java.util.Scanner;

public class Sets_1_10815 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr_1[]=new int[n];
        for(int i=0; i<n; i++){
            arr_1[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int arr_2[]=new int[m];
        for(int i=0; i<m; i++){
            arr_2[i]= sc.nextInt();
        }
        int k=0;
        while(k<m){
            int s=0;
            int count=0;
            while(s<n){
                if(arr_2[k]==arr_1[s]){
                    count++;
                }
                s++;
            }
            System.out.print(count+" ");
            k++;
        }
    }
}
