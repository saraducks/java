/*
 * conversion between different bases
 */
public class Convertbase {
	
   public void convert(String inputstring,int base1,int base2){
	   boolean isNegative = inputstring.startsWith("-");
	   int str = 0;
	   int lengthOfString = 0;
	   int x = 0;
	   if(isNegative){
	    lengthOfString = inputstring.length()-2;
	   }
	   else{
		lengthOfString = inputstring.length()-1;  
	   }
	   for(int counter = (inputstring.startsWith("-")?1:0); counter < inputstring.length(); counter++){
		   x = (int) Math.pow(base1,lengthOfString);
		   x *= Character.isDigit(inputstring.charAt(counter))? inputstring.charAt(counter) - '0': inputstring.charAt(counter)-'A'+10;
		   str += x;
		   lengthOfString -= 1;
	   }
	   String s = secondBaseConversion(str,base2);
	   System.out.println(s);
   }
   
   public String secondBaseConversion(int deciequivalent,int base2){
	   	return deciequivalent==0?"": secondBaseConversion(deciequivalent/base2,base2)
			+(char)((deciequivalent%base2)>=10?'A' + deciequivalent%base2 -10: '0'+deciequivalent%base2);
   }
  
public static void main(String args[]){
	Convertbase cb = new Convertbase();
    cb.convert("615", 7, 13);
    cb.convert("1BA", 15, 3);
    cb.convert("6896679", 9, 14);
}
}
