import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
    public static void printLevelWise(BinaryTree<Integer> root) {
		if(root==null || root.data ==-1){
			return;
		}
		//Your code goes here
		Queue<BinaryTree<Integer>> pendingQueue = new LinkedList<BinaryTree<Integer>>();
        pendingQueue.add(root);
		while(!pendingQueue.isEmpty()){
			BinaryTree<Integer>curruntNode=pendingQueue.poll();
			System.out.print(curruntNode.data+":L:");
			if(curruntNode.left!=null){
				pendingQueue.add(curruntNode.left);
				System.out.print(curruntNode.left.data);
			}else {
                System.out.print("-1"); 
            }
			System.out.print(",R:");
			if(curruntNode.right!=null){
				pendingQueue.add(curruntNode.right);
				System.out.print(curruntNode.right.data);
			}else {
                System.out.print("-1"); 
            }
			System.out.println(); 
		}
	} 
}
