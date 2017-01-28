
public class Height_balanced {
    
	int left_counter = 0;
	int right_counter = 0;
	boolean balanced = false;
	public void isHeightBalanced(BinaryTree root){
		while(root != null){
			if(root.Left != null){
				left_counter += 1;
				isHeightBalanced(root.Left);
			}
			if(root.Right != null){
				right_counter += 1;
				isHeightBalanced(root.Right);
			}
		}
		if(Math.abs(left_counter - right_counter) <= 1){
			balanced = true;
			System.out.println(balanced);
		}
	}
	
	public static void main(String args[]){
		Height_balanced h = new Height_balanced();
		BinaryTree b = new BinaryTree();
		b.BinaryTree(12);
		b.BinaryTree(45);
		b.BinaryTree(9);
		
		
	}
}



class BinaryTree{
	int data;
	BinaryTree Left, Right;
	BinaryTree Root = null;
	public void BinaryTree(int i){
		if(BinaryTree.this.Root == null){
					Root.data = i;
					Root.Left = null;
					Root.Right = null;
				}
		else if(BinaryTree.this.Root.data > i){
			       BinaryTree(Root.Left.data);
			       Root.Left.data = i;
			       this.Left.Left = null;
			       this.Left.Right = null;
			}
		else{
			BinaryTree(Root.Right.data);
			Root.Right.data = i;
			this.Right.Left = null;
		    this.Right.Right = null;
		}
	}

}
	