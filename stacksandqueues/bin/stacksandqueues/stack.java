package stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class stack {
	/*
	 * the MaxAPI object is passed for Deque interface
	 */
	Deque<MaxAPI> deq = new LinkedList<MaxAPI>();
	/*
	 * Pushes input element to the beginning of the Deque
	 * Math.max to find a maximum element
	 */
	void push(int inputelement){
		deq.addFirst(new MaxAPI(inputelement,Math.max(inputelement,empty() ? inputelement : Max())));
	   
   }
	//Checks for empty stack
	boolean empty(){
		return deq.isEmpty();
	}
	//removes first element in Deque
	int pop(){
	    return deq.removeFirst().element;
   }
   //peeks the first element in Deque
	 public Integer Max(){
	     if(empty()){
			   System.out.println("Illegalstateexception");
		   }
	 	   return deq.peek().max;
	    }
	
}
