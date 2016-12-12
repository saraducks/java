import java.util.HashMap;

public class Checkperm {
  public static void main(String args[]){
	  String str1 = "madam";
	  String str2 = "bag";
	  HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
	  HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
	  for(int i=0 ; i < str1.length(); i++){
		  if(h1.containsKey(str1.charAt(i))){
			  int value = h1.get(str1.charAt(i));
			  h1.put(str1.charAt(i), value+1);
		  }
		  else{
			  h1.put(str1.charAt(i), 1);
		  }
	  }
	  for(int i=0 ; i < str2.length(); i++){
		  if(h2.containsKey(str2.charAt(i))){
			  int value = h2.get(str2.charAt(i));
			  h2.put(str2.charAt(i), value+1);
		  }
		  else{
			  h2.put(str2.charAt(i), 1);
		  }
	  }
	  boolean result = h1.keySet().equals(h2.keySet());
	  System.out.println(result);
  }
}
