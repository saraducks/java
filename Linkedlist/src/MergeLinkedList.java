
public class MergeLinkedList {
   
	private static ListNode<Integer> mergeList(ListNode<Integer> L1,ListNode<Integer> L2){
		
		ListNode<Integer> temp1 = new ListNode<Integer>(0,null);
		ListNode<Integer> temp = temp1;
		while(L1 != null && L2 != null){
			System.out.println(L1.data);
			System.out.println(L2.data);

			if(L1.data >= L2.data){
               temp.next = L2;
               L2 = L2.next;
			}
			else{
				temp.next = L1;
				L1 = L1.next;
			}
			temp = temp.next;
		}
		
		temp.next = L1 != null? L1:L2;
		return temp1.next;
	}
	
	public static void main(String args[]){
		
		ListNode<Integer> L1 = null;
		ListNode<Integer> L2 = null;
        L1 = new ListNode<Integer>(3,null);
        ListNode<Integer> addnew = new ListNode<Integer>(8,null);
        L1.add(addnew);
        L2 = new ListNode<Integer>(2,null);
        MergeLinkedList.mergeList(L1, L2);
		
		}
}

