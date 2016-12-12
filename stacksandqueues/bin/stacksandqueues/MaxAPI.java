package stacksandqueues;

/*
 * MaxAPI has two variables to store element 
 * with max of all the elements including the current element
 */
public class MaxAPI extends stack{
    Integer max;	
    Integer element;
    
    MaxAPI(){
    	max = 0;
    	element = 0;
    }
 
   MaxAPI(Integer element,Integer max){
	   this.element = element;
	   this.max = max;
   }
   
   public static void main(String args[]){
	   MaxAPI  ma = new MaxAPI();
	   ma.push(10);
	   ma.push(90);
	   System.out.println("Maximum element before popping "+ma.Max());
	   ma.push(100);
	   ma.push(120);
	   System.out.println("Maximum element before popping "+ma.Max());
	   System.out.println(ma.pop());
	   System.out.println(ma.pop());
	   System.out.println("After popping the maximum element is "+ma.Max());
   }
}


