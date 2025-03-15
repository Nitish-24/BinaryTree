public class NoOfNodes {
    public static int numberOfNodes(BinaryTree<Integer>root){
       
        if (root ==null) {
            return 0;
        }
        int sum = numberOfNodes(root.left)+ numberOfNodes(root.right);
        return sum+1;
    }
   
}
