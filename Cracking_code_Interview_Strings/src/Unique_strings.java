import java.util.Scanner;

public class Unique_strings {
   public static void main(String args[]){
	   Scanner in = new Scanner(System.in);
	   String input_string = in.next();
	   String temp = input_string.toLowerCase();
	   int check = 0;
	   System.out.println("Check initial value: "+check);
	   for(int i = 0; i < temp.length(); i ++){
		   int c = temp.charAt(i) - 'a';
           System.out.println("Getting the decimal values from ascii table: "+c);
           System.out.println(check);
           System.out.println(1 << c);
		   if((check & (1 << c)) > 0){
			   System.out.println("f");
			   break;
		   }
		   check |= (1 << c);
		   System.out.println("Initialzing the check at end of each loop :"+check);
	   }
	   
   }
}
