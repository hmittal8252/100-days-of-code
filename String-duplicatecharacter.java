
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
	    for(int i=0;i<str.length();i++){
	        if(map.containsKey(str.charAt(i))){
	            int n=map.get(str.charAt(i))+1;
	            map.put(str.charAt(i),n);
	        }
	        else{
	            map.put(str.charAt(i),1);
	        }
	    }
   for (Map.Entry<Character, Integer> entry :map.entrySet())
        {
            if(entry.getValue()>=2){
            System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


	}
}
