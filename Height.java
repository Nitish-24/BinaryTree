public class Height {
    public static int height(BinaryTree<Integer> root) {
		if (root==null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+ Math.max(leftHeight,rightHeight);
        // return (root == null) ? 0 : 1 + Math.max(height(root.left), height(root.right));
	}
}
