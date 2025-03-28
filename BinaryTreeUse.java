import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeReturn isBalancedBetter(BinaryTree<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BinaryTreeReturn ans = new BinaryTreeReturn();
            ans.height = height;
            ans.isBal = isBal;
            return ans;
        }
        BinaryTreeReturn leftOutput = isBalancedBetter(root.left);
        BinaryTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height ,rightOutput.height);
 
        if (Math.abs(leftOutput.height-rightOutput.height)>1) {
            isBal=false;
        }
        if (!leftOutput.isBal || !rightOutput.isBal) {
            isBal = false;
        }
        BinaryTreeReturn result = new BinaryTreeReturn();
        result.height = height;
        result.isBal = isBal;
        return result;


    }

    public static BinaryTree<Integer> takeBinaryTreeBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data:");
        } else {
            if (isLeft) {
                System.out.println("Enter left child data of :" + parentData);
            } else {
                System.out.println("Enter right child data of:" + parentData);
            }
        }
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int rootData = scn.nextInt();
        // scn.close();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        BinaryTree<Integer> rootLeft = takeBinaryTreeBetter(false, rootData, true);
        BinaryTree<Integer> rootRight = takeBinaryTreeBetter(false, rootData, false);
        root.left = rootLeft;
        root.right = rootRight;
        return root;

    }

    public static BinaryTree<Integer> takeBinaryTree() {
        System.out.println("Enter data:");
        Scanner scn = new Scanner(System.in);
        int rootData = scn.nextInt();
        scn.close();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        BinaryTree<Integer> rootLeft = takeBinaryTree();
        BinaryTree<Integer> rootRight = takeBinaryTree();
        root.left = rootLeft;
        root.right = rootRight;
        return root;

    }

    public static void printTreeDetail(BinaryTree<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " :");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetail(root.left);
        printTreeDetail(root.right);
    }

    public static void printTree(BinaryTree<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        // BinaryTree<Integer>root = new BinaryTree<Integer>(10);
        // BinaryTree<Integer>rootLeft = new BinaryTree<Integer>(20);
        // BinaryTree<Integer>rootRight = new BinaryTree<Integer>(30);
        // root.left=rootLeft;
        // root.right = rootRight;
        // BinaryTree<Integer>rootleftRight = new BinaryTree<Integer>(40);
        // BinaryTree<Integer>rootrightleft = new BinaryTree<Integer>(50);
        // rootLeft.right =rootleftRight;
        // rootRight.left = rootrightleft;
        // printTree(root);
        // BinaryTree<Integer> root = takeBinaryTreeBetter(true,0,true);
        BinaryTree<Integer> root = InputLevelWise.inputLevelWise();
        printTreeDetail(root);
        // System.out.println(NoOfNodes.numberOfNodes(root));
    }
}
