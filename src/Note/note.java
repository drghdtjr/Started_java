package Note;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        // 스트링 단어에 해당하는 알파뱃이 있으면 +1
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int arr[]=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        int i=0;
        while(i<s.length()){
            int num=s.charAt(i)-'a';
            int j=0;
            while(j<26){
                if(j==num){
                    arr[j]++;
                }
                j++;
            }
            i++;
        }
        int k=0;
        while(k<26){
            System.out.println(arr[k]);
            k++;
        }



    }
}
