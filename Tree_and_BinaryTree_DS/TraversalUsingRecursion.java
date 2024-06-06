package Tree_and_BinaryTree_DS;

public class TraversalUsingRecursion {
    Node root = null;

    public static void inOrder(Node node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public static void preOrder(Node node){
        if(node == null)
            return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {
        TraversalUsingRecursion t = new TraversalUsingRecursion();
        t.root = new Node(10);
        t.root.left = new Node(20);
        t.root.left.left = new Node(40);
        t.root.left.right = new Node(60);
        t.root.right = new Node(30);
        t.root.right.left = new Node(50);
        t.root.right.right = new Node(70);

        inOrder(t.root);
        System.out.println();
        preOrder(t.root);
        System.out.println();
        postOrder(t.root);
    }
}
