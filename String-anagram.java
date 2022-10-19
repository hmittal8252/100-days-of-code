import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine();
		String str2=scn.nextLine();
		System.out.print(isanagram(str1,str2));
		}
		public static boolean isanagram(String str1,String str2){
		    	HashMap<Character,Integer>map1=new HashMap<>();
			    for(int i=0;i<str1.length();i++){
	        if(map1.containsKey(str1.charAt(i))){
	            int n=map1.get(str1.charAt(i))+1;
	            map1.put(str1.charAt(i),n);
	        }
	        else{
	            map1.put(str1.charAt(i),1);
	        }
	    }
	     for(int i=0;i<str2.length();i++){
	        if(map1.containsKey(str2.charAt(i))){
	            int n=map1.get(str2.charAt(i))-1;
	            map1.put(str2.charAt(i),n);
	        }
	        else{
	            return false;
	        }
	    }
	    Set<Character>keys=map1.keySet();
	    for(Character key:keys){
	        if(map1.get(key)!=0){
	            return false;
	        }
	    }
	    return true;

		}
}
