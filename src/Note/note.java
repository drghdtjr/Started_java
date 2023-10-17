package Note;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[]=new int [n];
        int i=0;
        int count=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        while(i<n){
            if(arr[i]%3==0){
                count++;
            }
            i++;
        }


    }
}
