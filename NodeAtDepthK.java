public class NodeAtDepthK {
    
    public static void NodeatDepthK(BinaryTree<Integer>root, int k){
        if (root==null|| k<0) {
            return;
        }
        if (k==0) {
            System.out.println(root.data);
            return;
        }
        NodeatDepthK(root.left, k-1);
        NodeatDepthK(root.right, k-1);
    }
}
