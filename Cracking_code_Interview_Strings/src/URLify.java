
public class URLify {
 public static void main(String args[]){
	 String str="sara you can do it";
	 StringBuffer sb = new StringBuffer();
	 for(int i=0; i < str.length(); i++){
		 if(str.charAt(i)==' '){
			 sb.append("%20");
		 }
		 else{
			 sb.append(str.charAt(i));
		 }
	 }
	 System.out.println(sb);
 }
}
