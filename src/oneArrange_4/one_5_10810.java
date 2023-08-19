package oneArrange_4;

import java.util.Scanner;

public class one_5_10810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int [n];
        int m= sc.nextInt();
        int i=0;
        while(i<m){

            int I= sc.nextInt();
            int J= sc.nextInt();
            int K= sc.nextInt();
            int j=I-1;
            while(j<J) {
                arr[j]=K;
                j++;
            }
            i++;
        }
        int k=0;
        while(k< arr.length){
            System.out.print(arr[k]+" ");
            k++;
        }


    }
}
