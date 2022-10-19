import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.print("Initial string is  "+str);
    	 StringBuilder sb=new StringBuilder();
    	 for(int i=str.length()-1;i>=0;i--){
    	     sb.append(str.charAt(i));
    	 }
    
		System.out.print("After reverse  "+ sb.toString());
	}
}
