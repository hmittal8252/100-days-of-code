import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.print(ispalindrome(str));
	}
		 
	 public static boolean ispalindrome(String str)
	 {
        	int i=0;int j=str.length()-1;
		    while(i<=j)
		    {
		    if(str.charAt(i)!=str.charAt(j)){
		        return false;
		    }
		    i++;
		    j--;
         	}
         	return true;
		 }
}
