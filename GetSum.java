public class GetSum {
    public static int getSum(BinaryTree<Integer> root) {
        // Your code goes here.
        if (root == null || root.data == -1) {
            return 0;
        }
        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        return leftSum + root.data + rightSum;
    }
}
