package snippet;

public class demosinglylinkedlist {
	public NodeList<Integer> reversesublist(NodeList<Integer> N,int start,int end){
		if(start == end){
			return N;
		}
		NodeList<Integer> dummy = new NodeList<Integer>(0,N);
		NodeList<Integer> head = dummy;
		int count = 1;
		while(count++ < start){
			head = head.next;
		}
		
		NodeList<Integer> sublisthead = head.next;
		
		while(start++ < end){
			NodeList<Integer> temp = sublisthead.next;
			
			
		}
		return dummy.next;
	}
	public static void main(String args[]){
		demosinglylinkedlist rsl = new demosinglylinkedlist();
		NodeList<Integer> nl;
		
		nl = new NodeList<>(1, new NodeList<>(2, new NodeList<>(3, null)));
	    NodeList<Integer> result = rsl.reversesublist(nl, 0, 2);
	    System.out.println(result.data);
	    System.out.println(result.next.data);
	    System.out.println(result.next.next.data);
	}
}
 class NodeList<Integer>{
	 int data;
	 NodeList<Integer> next;
	 NodeList(){
		 data = 0;
		 next = null;
	 }
	 NodeList(int i){
		 data = i;
	 }
	 NodeList(int i,NodeList<Integer> n){
		 data = i;
		 next = n;
	 }
	 public void insertNode(NodeList<Integer> List, NodeList<Integer> newnode){
		 newnode.next = List.next;
		 List.next = newnode;
	 }
 }
