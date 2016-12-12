
public class converter {

	/*
	 * integer input is convereted to string 
	 */
	public StringBuilder convertToStr(int input_int){
		boolean isNegative = false;
		if(input_int < 0){
			input_int = -input_int;
			isNegative = true;
		}
		
		int parseinputint = input_int;
		StringBuilder resultstr = new StringBuilder();
		if(input_int < 0){
			
		}
		do{
			resultstr.append(input_int%10);    /* gives the last digit */
			input_int /= 10;                   
		}while(input_int != 0);
		
		if(isNegative){
			resultstr.append('-');
		}
		return resultstr.reverse();          /* reverse the resultstr to get original string */
	}
	
	public int convetToInt(String input_string){
		boolean isNegative = false;
		if(input_string.charAt(0)=='-'){
			isNegative = true;
		}
		int strtoint = 0;
		for(int len = input_string.charAt(0)=='-'?1:0;len<input_string.length();len++){
			int digit = input_string.charAt(len)-'0';  /* to get integer */
			strtoint = strtoint*10 + digit;
		}
		return isNegative?-strtoint:strtoint;
	}
	
	public static void main(String args[]){
		converter c = new converter();
		int result = c.convetToInt("-123");
		int result2 = c.convetToInt("59096");
		System.out.println("The string to integer conversion "+result);
		System.out.println("The string to integer conversion "+result2);
		StringBuilder s = c.convertToStr(-4567);
		StringBuilder s1 = c.convertToStr(1386996907);
		System.out.println("The integer to string "+s);
		System.out.println("The integer to string "+s1);
	}
	
}
