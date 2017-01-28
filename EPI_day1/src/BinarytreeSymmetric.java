
public class BinarytreeSymmetric {
	Node Root;
	static boolean isSymme = false;
	boolean res1 = false;
	boolean res2 = false;
	public boolean isSymmetric(Node L, Node R){
		if(L == null && R == null){
			isSymme = true;
		}
		else if(L.data == R.data){
			isSymme = true;
		}
		else{
			isSymme = false;
		}
		if(L != null && R!= null){
			if(L.Left != null && R.Right != null){
				System.out.println(L.Left.data+" This is left child "+R.Right.data+" This is right child");
				isSymmetric(L.Left,R.Right);
				res1 = isSymme;
				System.out.println("This is Res1"+res1);
			}
			if(L.Right != null && R.Left != null){
				System.out.println(L.Right.data+" This is left child "+R.Left.data+" This is right child");
				isSymmetric(L.Right, R.Left);
				res2 = isSymme;
				System.out.println("This is Res2"+res2);

			}
			return res1&&res2;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		BinarytreeSymmetric bts = new BinarytreeSymmetric();
		bts.Root = new Node(1);
		bts.Root.Left = new Node(2);
		bts.Root.Right = new Node(2);
		bts.Root.Left.Right = new Node(3);
		bts.Root.Right.Left = new Node(3);
		bts.Root.Left.Left = new Node(9);
		bts.Root.Right.Right = new Node(4);
		boolean t = bts.isSymmetric(bts.Root,bts.Root);
		System.out.println(t);
	}
}

class Node{
	int data;
	Node Right,Left;
	Node(int i){
		 data = i;
		 Right = Left = null;
	}
	
}