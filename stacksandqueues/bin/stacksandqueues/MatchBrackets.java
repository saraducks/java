package stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class MatchBrackets {
    private void findMatchingBrackets(String inputexpression){
    	Deque<Character> mdq = new LinkedList<>();
    	for(int i = 0 ; i < inputexpression.length(); i++){
    		if(inputexpression.charAt(i) == '[' ||inputexpression.charAt(i) == '{'||inputexpression.charAt(i) == '('){
    			mdq.addFirst(inputexpression.charAt(i));
    		}
    		if(inputexpression.charAt(i) == ']' || inputexpression.charAt(i) == '}' || inputexpression.charAt(i) == ')'){
    		switch(inputexpression.charAt(i)){
    		case ']':
    			if(mdq.peekFirst() == '['){
    				mdq.removeFirstOccurrence('[');
    				break;
    			}
    			else{
    				System.out.println("No matching open [ bracket.Error at"+inputexpression.charAt(i));
    				message(mdq);
    			}
    		case '}':
    			if(mdq.peekFirst() == '{'){
    				mdq.removeFirstOccurrence('{');
    				break;
    			}
    			else{
    				System.out.println("No matching open { bracket");
    				message(mdq);
    			}
    		case ')':
    			if(mdq.peekFirst() == '('){
    				mdq.removeFirstOccurrence('(');
    				break;
    			}
    			else{
    				System.out.println("No matching open ( bracket");
    				message(mdq);
    			}
    		default :
    			System.out.println("Illegal expression");
    		}
    	}
    }
    	if(mdq.isEmpty()){
    		System.out.println("matched");
    	}
   }
    
    public void message(Deque mdq){
    	if(mdq.size() == 0){
    		System.out.println("brackets matched");
    	}
    	else{
    		System.out.println("mismatch");
    	}
    }
    
    public static void main(String args[]){
    	MatchBrackets mb = new MatchBrackets();
    	mb.findMatchingBrackets("{[]}");
    	mb.findMatchingBrackets("()");
    	mb.findMatchingBrackets("(){}[]");
    	mb.findMatchingBrackets("[()[]]{}");
    	mb.findMatchingBrackets("(()[]{()[]{}{}})");
    	mb.findMatchingBrackets("({)]");
    	
    }
}
