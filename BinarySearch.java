import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter to no to find");
        int f=scn.nextInt();
       System.out.println(binarysearch(arr,n,f));
        
    }
    public static int binarysearch(int arr[],int n,int f){
        
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(f==arr[mid]){
                return mid;
            }
          else  if(f<arr[mid]){
                high=mid-1;
            }
            else if(f>mid){
                low=mid+1;
            }
           
        }
        return -1;
    }
}
