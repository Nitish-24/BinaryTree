public class ReplaceNodeWithDepth {
    public static void changeToDepthTree(BinaryTree<Integer> root) {
        if (root == null) {
            return;
        }

        changeToDepthTreeHelper(root, 0);
    }

    private static void changeToDepthTreeHelper(BinaryTree<Integer> root, int i) {

        if (root==null) {
            return;
        }

        root.data =i;
        changeToDepthTreeHelper(root.left, i+1);
        changeToDepthTreeHelper(root.right, i+1);

    }

}
