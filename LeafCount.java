public class LeafCount {
    public static int leafsCount(BinaryTree<Integer>root){
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
       return leafsCount(root.left) +leafsCount(root.right);

    }
}
