package Note;

import java.util.Scanner;

public class note_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int x=1;
            while(x<=i*2-1){
                System.out.print("*");
                x++;
            }
            System.out.println();
            i++;
        }
        int k=1;
        while(k<=n){
            int gap=1;
            while(gap<k){
                System.out.print("");
                gap++;
            }
            int z=2*k-1;
            while





            System.out.println();
            k++;
        }
    }
}
