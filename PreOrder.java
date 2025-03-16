public class PreOrder {
    public static void preOrder(BinaryTree<Integer> root) {
		if (root==null) {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
	}
}
