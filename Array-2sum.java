// Brute force
import java.util .*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=scn.nextInt();
			System.out.println("Enter elements of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
			System.out.println("Enter target");
			int target=scn.nextInt();
		for(int i=0;i<n-1;i++){
		    for(int j=i;j<n;j++){
		        if(i!=j&&arr[i]+arr[j]==target){
		            System.out.println(i+" "+j);
		              }	    }	}}}


// Optimised 
