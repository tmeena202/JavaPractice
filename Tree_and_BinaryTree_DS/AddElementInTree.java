package Tree_and_BinaryTree_DS;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddElementInTree {
    Node root = null;
    List<Integer> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    AddElementInTree(){}
    AddElementInTree(int val){
        new Node(val);
    }
    public Node add(){
        System.out.println("Enter value for node :");
        int data = scanner.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        //
        System.out.println("Left of " + data);
        root.left = add();
        //
        System.out.println("Right of " + data);
        root.right = add();
        return root;
    }
    List<Integer> inorder(Node curr){
//        if(root.left == null && root.right == null) {
//            list.add(curr.val);
//            System.out.println(list.toString());
//            return list;
//        }
        if(curr == null) {
            return list;
        }
        list.add(curr.val);
        inorder(curr.left);
        inorder(curr.right);
        return list;
    }

    public static void main(String[] args) {
        AddElementInTree addElementInTree = new AddElementInTree();
        addElementInTree.add();
        addElementInTree.inorder(addElementInTree.root);
        System.out.println(addElementInTree.list);
    }
}
