public class WithoutSiblings {
    public static void printNodesWithoutSibling(BinaryTree<Integer> root) {
		//Your code goes here
        if (root==null) {
            return;
        }
        if (root.left==null &&root.right!=null) {
            System.out.print(root.right.data+" ");
        }
		if (root.right==null &&root.left!=null){
            System.out.print(root.left.data+" ");
		}
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}

}
