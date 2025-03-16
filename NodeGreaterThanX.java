public class NodeGreaterThanX {
    public static int countNodesGreaterThanX(BinaryTree<Integer> root, int x) {
		if (root==null) {
            return 0;
        }
        int leftCount = countNodesGreaterThanX(root.left, x);
        int rightCount = countNodesGreaterThanX(root.right, x);
        if (root.data>x) {
            return 1 + leftCount +rightCount;
        }
        return leftCount + rightCount;
	}
}
