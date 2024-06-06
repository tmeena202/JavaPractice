package Tree_and_BinaryTree_DS;


public class HeightOfTree {
    public static int height(Node node1){
        if(node1 == null)
            return 0;
        int l = height(node1.left);
        int r = height(node1.right);

        return Math.max(l,r) + 1;
    }
    public static boolean find(Node root, int key){
        //
        if( root == null)
            return false;
        if(key == root.val)
            return true;
        return find(root.left, key) || find(root.right, key);
    }
    static int Max;
    public static int max(Node root){
        //
        if( root == null)
            return 0;
        if(root.val > Max)
            Max = root.val;
        int l = max(root.left);
        int r = max(root.right);
        return Max;
    }

    public static void main(String[] args) {
        TraversalUsingRecursion t = new TraversalUsingRecursion();
        t.root = new Node(10);
        t.root.left = new Node(100);
        t.root.left.left = new Node(40);
        t.root.left.right = new Node(60);
        t.root.right = new Node(30);
        t.root.right.left = new Node(50);
        t.root.right.right = new Node(0);
      //  System.out.println(height(t.root));
        //System.out.println(find(t.root, 70));
        System.out.println(max((t.root)));
    }
}
