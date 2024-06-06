package Tree_and_BinaryTree_DS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // using recursion
    public static void levelOrderTraversal(Node node, int level){
      if(node == null)
          return;
      if( level == 1 )
          System.out.print(node.val+ " ");
      else if (level > 1) {
          levelOrderTraversal(node.left, level -1);
          levelOrderTraversal(node.right, level -1);
      }
    }

    // using Queue and iteration
    public static void bfsUsingQueue(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int n = q.size();
            for (int i =1; i<= n; i++){
                Node curr = q.poll();
                System.out.print(curr.val + " ");
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        HeightOfTree h = new HeightOfTree();
        TraversalUsingRecursion t1 = new TraversalUsingRecursion();
        t1.root = new Node(10);
        t1.root.left = new Node(20);
        t1.root.left.left = new Node(40);
        t1.root.left.right = new Node(60);
        t1.root.right = new Node(30);
        t1.root.right.left = new Node(50);
        t1.root.right.right = new Node(70);

        System.out.println(HeightOfTree.height(t1.root));
        levelOrderTraversal(t1.root, 3);
        bfsUsingQueue(t1.root);

    }
}
