public class NodePresent {
    public static boolean isNodePresent(BinaryTree<Integer> root, int x) {
	    
        if (root==null) {
            return false;
        }
        if (root.data==x) {
            return true;
        }
        return isNodePresent(root.left, x) || isNodePresent(root.right, x);
	}
}
