public class BinaryTreeUse {
 
    public static void printTree(BinaryTree<Integer> root){
        if (root==null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        BinaryTree<Integer>root = new BinaryTree<Integer>(10);
        BinaryTree<Integer>rootLeft = new BinaryTree<Integer>(20);
        BinaryTree<Integer>rootRight = new BinaryTree<Integer>(30);
        root.left=rootLeft;
        root.right = rootRight;
        BinaryTree<Integer>rootleftRight = new BinaryTree<Integer>(40);
        BinaryTree<Integer>rootrightleft = new BinaryTree<Integer>(50);
        rootLeft.right =rootleftRight;
        rootRight.left = rootrightleft;
        printTree(root);
    }
}
