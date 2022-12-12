// Ques : 5 44 333 2222 11111

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  for(int i=n;i>0;i--){
	     for(int j=1;j<=n-i+1;j++){
	         System.out.print(i);
	     }
	  }
	}
}

/*Ques : 
11111
22222
33333
44444*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  for(int i=1;i<=n;i++){
	     for(int j=1;j<=n;j++){
	         System.out.print(i);
	     }
	     System.out.println();
	  }
	}
}

/* Ques 3 :  
1
22
333
4444
55555 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  for(int i=1;i<=n;i++){
	     for(int j=1;j<=i;j++){
	         System.out.print(i);
	     }
	     System.out.println();
	  }
	}
}

/* Ques 4 : 
1
12
123
1234
12345
*/
