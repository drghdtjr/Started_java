package math1_8;

import java.util.Scanner;

public class math1_7_2869 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int v=sc.nextInt();
        int k=a-b;
        int count=0;
        int i=0;
        while(i<v){
            int j=k*count;
            if(j>=v){
                break;
            }
            else{
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
