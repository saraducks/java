import java.util.Scanner;

/*
 * bubble sorts the given array
 */
public class BubbleSort {
	void arraysBubbleSort(int[] arraytosort){
		int total_array_size = arraytosort.length;
	    for(int outer=0; outer<arraytosort.length; outer++){
	    	for(int i=0; i<total_array_size; i++){
	    		if(i+1 < total_array_size){
	    			if(arraytosort[i]>arraytosort[i+1]){
	    				int temp = arraytosort[i];
					    arraytosort[i] = arraytosort[i+1];
					    arraytosort[i+1] = temp;
			         }
		          }
	           }
		    total_array_size--;
	  }	
	  for(int j: arraytosort){
		  System.out.print(j+",");
	  }
	}
    void swap(int firstelement, int secondelement){
		int temp = firstelement;
		firstelement = secondelement;
		secondelement = temp;
	}
	
 public static void main(String args[]){
	 BubbleSort sort = new BubbleSort();
	 Scanner get_user_input = new Scanner(System.in);
	 System.out.println("Enter the number of elements to be sorted");
	 int size_of_array = get_user_input.nextInt();
	 int sortarray[] = new int[size_of_array];
	 System.out.print("Enter the elemnets of size"+size_of_array);
	 for(int i=0; i<sortarray.length; i++){
		 System.out.println("Enter the"+i+"th element");
		 sortarray[i] = get_user_input.nextInt();
	 }
	 sort.arraysBubbleSort(sortarray);
 }
}
