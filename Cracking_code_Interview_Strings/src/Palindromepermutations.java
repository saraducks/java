import java.util.Arrays;

public class Palindromepermutations {
 public static void main(String args[]){
	 String palindrome = "gag";
	 String randomstring = "ag";
	 char palindrome_array[] = palindrome.toCharArray();
	 char randomstring_array[] = randomstring.toCharArray();
	 Arrays.sort(palindrome_array);
	 Arrays.sort(randomstring_array);
	 outerloop:
	 if(palindrome.length() == randomstring.length()){
		for(int i=0,j=0; i < palindrome.length(); i++,j++){
			if(palindrome_array[i] != randomstring_array[j]){
				System.out.println("The given string is not the permutation of the palindrome");
				break outerloop;
			}
	     }
		System.out.println("Given string is the permutation of the palindrome");
      } 
	 else{
		System.out.println("The given string is not permutation of the palindrome");	
	 }
 }
}
