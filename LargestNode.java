public class LargestNode {
    public static int largestNode(BinaryTree<Integer> root) {

        if (root == null) {
            return -1;
        }
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(largestLeft, Math.max(root.data, largestRight));
    }
}
