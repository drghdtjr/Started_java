package Note;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        String arr[]=new String[n];
        while(i<n){
            arr[i]= sc.next();
            i++;
        }
        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(arr[0]);
        int k=0;
        while(k<n){
            int j=k+1;
            while(j<n){
                if(arr[k].length()==arr[j].length()){
                    if(arr[k].charAt(0)-'a'>arr[j].charAt(0)-'a'){
                        String temp=arr[k];
                        arr[k]=arr[j];
                        arr[j]=temp;
                    }
                }
                j++;
            }
            k++;
        }
        int s=1;
        while(s< arr.length){
            if(!arr[s].equals(arr[s-1])){
                System.out.println(arr[s]);
            }
            s++;
        }

    }
}
