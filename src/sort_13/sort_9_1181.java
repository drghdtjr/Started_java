package sort_13;

import java.util.Scanner;

public class sort_9_1181 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[]arr=new String[n];
        int i=0;
        while(i<n){
            arr[i]= sc.next();
            i++;
        }
        int k=0;
        while(k<n-1){
            int dex=k;
            int j=k+1;
            while(j<n){
                if(arr[j].length()<arr[dex].length()){
                    dex=j;

                }
                j++;
            }
            String temp=arr[i];
            arr[i]=arr[dex];
            arr[dex]=temp;
            k++;
        }
        int j=0;
        while(j<n){
            System.out.println(arr[j]);
            j++;
        }


    }
}
