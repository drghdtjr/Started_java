package Note;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0; j<10;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int i=1;
        int k=1;
        while(true){
            if(arr[i][k]==0){
                arr[i][k]=9;
                k++;
            }
            else if(arr[i][k]==1){
                k--;
                i++;
            }
            else if(arr[i][k]==2){
                arr[i][k]=9;
                break;
            }
            else if(arr[i+1][k]!=1&&arr[i][k+1]!=1){
                arr[i][k]=9;
                break;
            }
        }


        for(int a=0;a<10;a++){
            for(int j=0; j<10;j++){
                System.out.print(arr[a][j]);
            }
            System.out.println();
        }



    }
}
