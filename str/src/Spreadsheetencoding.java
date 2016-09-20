import java.util.HashMap;
import java.util.Map;

public class Spreadsheetencoding {
	
private static int getColumnNumber(String inputString){
	int result = 0;
    if(inputString.length() > 1){
	  for(int i=0; i < inputString.length(); i++){
		  char c = inputString.charAt(i);
		  result = result *  26 + c - 'A' + 1;
		}
	   }
	 return result;
  }
	
private static int getColumnNumber(char inputString){
         return inputString - 'A'+ 1;

 }
	
public static void main(String args[]){
		Spreadsheetencoding s = new Spreadsheetencoding();
		int testone = s.getColumnNumber("ZZ");
		int testtwo = s.getColumnNumber('A');
		int testthree = s.getColumnNumber('B');
		int testfour = s.getColumnNumber('Y');
		int testfive = s.getColumnNumber('Z');
		int testsix = s.getColumnNumber("AZ");
		int testseven = s.getColumnNumber("AY");
		int testeight = s.getColumnNumber("YZ");
		int testnine = s.getColumnNumber("AAA");
		int testten = s.getColumnNumber("BZ");
		int testeleven = s.getColumnNumber("AAC");
		System.out.println("ZZ :"+testone);
		System.out.println("A :"+testtwo);
		System.out.println("B :"+testthree);
		System.out.println("Y :"+testfour);
		System.out.println("Z :"+testfive);
		System.out.println("AZ :"+testsix);
		System.out.println("AY :"+testseven);
		System.out.println("YZ :"+testeight);
		System.out.println("AAA :"+testnine);
		System.out.println("BZ :"+testten);
		System.out.println("AAC :"+testeleven);
 }
}