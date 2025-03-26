public class RemoveLeafNode {
    public static BinaryTree<Integer> removeLeaf(BinaryTree<Integer>root){
        if (root==null) {
            return null;
        }
        if (root.left==null && root.right==null) {
            return null;
        }

        root.left= removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
}
