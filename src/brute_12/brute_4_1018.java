package brute_12;

import java.util.Scanner;

public class brute_4_1018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int i=0;
        String arr[]=new String[m]
        while(i<n){
            String st= sc.next();
            int j=0;
            while(j<m){
                arr[j]=st.charAt(j);

                j++;
            }
            i++;
        }
    }
}
