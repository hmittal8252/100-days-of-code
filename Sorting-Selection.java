//Selection sort
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner scn=new Scanner (System.in);
         int n=scn.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=scn.nextInt();
         }
         for(int i=0;i<n-1;i++){
             int minidx=i;
             for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                    int temp=arr[minidx];
                   arr[minidx]=arr[i];
                    arr[i]=temp;
                }
             }
         }
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
