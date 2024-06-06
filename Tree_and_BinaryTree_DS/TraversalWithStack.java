package Tree_and_BinaryTree_DS;

import java.util.Stack;

public class TraversalWithStack {
    public static void InorderUsingStack(Node root){
        Stack<Node> s = new Stack<>();
        Node curr = root;
        // traverse all the node of the tree
        while (curr != null || s.size() > 0) {
            // traverse all the left node of the tree and add to stack until we reach null
            while (curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        InorderUsingStack(root);
    }
}
