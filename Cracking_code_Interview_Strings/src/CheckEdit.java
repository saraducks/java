import java.util.Arrays;
import java.util.Scanner;
public class CheckEdit {
	Scanner in = new Scanner(System.in);
	boolean Check(String input, String result){
		char original_array[] = input.toCharArray();
		char modified_array[] = result.toCharArray();
		int count = 0;
		if(original_array.length == modified_array.length){
			for(int i=0,j=0; i<modified_array.length; j++,i++){
				if(original_array[i]==modified_array[j]){
					//do nothing
				}
				else if((original_array[i]!=modified_array[j]) && count == 0){
					count++;
					i = i+1;
					j = j+1;
					System.out.println(original_array[i]);
					System.out.println(modified_array[j]);
				}
				else{
					return false;
				}
			}
			return true;
		}
		else if(original_array.length-1 == modified_array.length && count == 0){
			for(int i=0,j=0; i<modified_array.length; j++,i++){
				if(original_array[i]!=modified_array[j] && count == 0){
					count++;
					i = i+1;
				}
				else{
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}
	 void CheckOnePass(String input_from_user, int choice){
		char input_array[] = input_from_user.toCharArray();
		String result = null;
		switch(choice){
		case 1: result = delete(input_from_user);
		        boolean check_result = Check(input_from_user, result);
		        System.out.println(check_result);
		        break;
		case 2: result = edit(input_from_user, input_array);
		        boolean check_result1 = Check(input_from_user, result);
		        System.out.println(check_result1);
		        break;
		case 3: result = insert(input_from_user);
		        boolean check_result2 = Check(input_from_user, result);
		        System.out.println(check_result2);
		        break;
		}
	}
 
private String insert(String input_from_user) {
		// TODO Auto-generated method stub
		System.out.println("Enter the position you want to insert a character in the string"+input_from_user);
		int position = in.nextInt();
		char get_char = in.next().charAt(0);
		String result = insertCharAt(input_from_user,get_char,position);
		return result;
	}

private String insertCharAt(String input_from_user, char get_char, int position) {
	// TODO Auto-generated method stub
	String compute = null;
	if(position == 0){
		 compute = get_char + input_from_user.substring(0, input_from_user.length());
	}
	else{
		 compute = input_from_user.substring(0,position)+get_char+input_from_user.substring(position,input_from_user.length());
	}
	return compute;
}

private String edit(String input_from_user, char[] input_array) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of positions you want to change the string"+input_from_user);
		int user_input = in.nextInt();
		String result = null;
		for(int i=0; i <user_input; i++){
			System.out.println("Enter the"+i+"th to edit in the "+input_from_user +" string");
			System.out.println("Position?");
			int pos = in.nextInt();
			char input_char = in.next().charAt(0);
			char get_user_char = input_array[pos];
			input_from_user = input_from_user.replace(get_user_char, input_char);
		}
		return input_from_user;
	}

private String delete(String input_from_user) {
		// TODO Auto-generated method stub
	    System.out.println("Enter the position of the character to delete, index starts from zero"+input_from_user);
	    int get_position = in.nextInt();
	    String result = null;
	    if(get_position == 0){
	    	 result = input_from_user.substring(1,input_from_user.length());
	    	 System.out.println(result);
	    }
	    else{
	         result = input_from_user.substring(0,get_position).concat(input_from_user.substring(get_position+1, input_from_user.length()));
	    	 System.out.println(result);
	    }
	    return result;
	}

public static void main(String args[]){
	 CheckEdit c = new CheckEdit();
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the string");
	 String get_input = in.next();
	 System.out.println("1.delete, 2.edit, 3.insert");
	 int get_user_choice = in.nextInt();
	 c.CheckOnePass(get_input, get_user_choice);
 }
}
