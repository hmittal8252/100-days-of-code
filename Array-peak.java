// 1 2 3 1 8  peak element -> 3 or 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		    
		}
		System.out.println("Peak element is "+peak(arr,n));
	}
	public static int peak(int []arr ,int n){
	    int low=0;
	    int high=n-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(mid==0){
	            return arr[0];    // there is only single element so no Peak
	        }
	        else if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]){
	            return arr[mid];
	        }
	        else if(arr[mid]<arr[mid+1]){
	            low=mid+1;
	        }
	        else{
	            high=mid-1;
	        }
	    }
	    return -1;
	}
}
