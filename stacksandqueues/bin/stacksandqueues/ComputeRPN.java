package stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class ComputeRPN {
   private int computeExpression(String rpnexpressoin){
	   
	   Deque<Integer> dq = new LinkedList<>();
	   String[] s = rpnexpressoin.split(",");
	 
	   for(String temp : s){
		   if(temp.length() == 1 && "+-*/".contains(temp)){
			   final int i = dq.removeFirst();
			   final int j = dq.removeFirst();
			  
			   switch(temp.charAt(0)){ 
			   case '+':
				   dq.addFirst(i + j);
				   break;
			   case '-':
				   dq.addFirst(i - j);
				   break;
			   case '*':
				   dq.addFirst(i * j);
				   break;
			   case '/':
				   dq.addFirst(i / j);
				   break;
			   default:	
				   throw new IllegalArgumentException("RPN exception is"+temp);
			   }
		   }
		   else{
			   dq.addFirst(Integer.parseInt(temp));
		   }
		   
	   }
	   return dq.removeFirst();
 }
   public static void main(String args[]){
	   ComputeRPN c = new ComputeRPN();
	   int result = c.computeExpression("1,2,3,4,5,+,*,+,+,3,4,*,+");
	   System.out.println(result);
	   int result2 = c.computeExpression("2,-10,/");
	   System.out.println(result2);
   }
}