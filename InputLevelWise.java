import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputLevelWise {
    public static BinaryTree<Integer> inputLevelWise() {
        System.out.println("Enter root data:");
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int rootData = scn.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        Queue<BinaryTree<Integer>> pendingQueue = new LinkedList<BinaryTree<Integer>>();
        pendingQueue.add(root);
        while (!pendingQueue.isEmpty()) {
            BinaryTree<Integer>curruntNode = pendingQueue.poll();
            System.out.println("Enter left child data of " + curruntNode.data);
            int leftChild = scn.nextInt();
            if (leftChild != -1) {
                BinaryTree<Integer> leftChildNode = new BinaryTree<Integer>(leftChild);
                curruntNode.left = leftChildNode;
                pendingQueue.add(leftChildNode);
            }
            System.out.println("Enter right child data of " + curruntNode.data);
            int rightChild = scn.nextInt();
            if (rightChild != -1) {
                BinaryTree<Integer> rightChildNode = new BinaryTree<Integer>(rightChild);
                curruntNode.right = rightChildNode;
                pendingQueue.add(rightChildNode);
            }
        }
        // scn.close();
        return root;
    }
}
