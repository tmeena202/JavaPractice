package BinarySearchTree;

import Tree_and_BinaryTree_DS.*;

public class BST1 {
    public static Node insertInBST(Node node, int key){
        // if root is null and have no element
        if(node == null){
            // add a node in the BST because this is insert method
            return new Node(key);
        }

        if(key < node.val){
            node.left = insertInBST(node.left, key);
        }
        if(key > node.val){
            node.right = insertInBST(node.right, key);
        }
        return node;
    }

    public static boolean searchBST(Node root, int key){
        if(root == null)
            return false;
        // base condition
        if(key == root.val)
            return true;

        //
        if(key < root.val)
            return searchBST(root.left, key);
        else  // key > root.val
            return searchBST(root.right, key);
    }
    public static Node searchBST2(Node root, int key){
        if(root == null)
            return null;
        // base condition
        if(key == root.val)
            return root;

        //
        if(key < root.val)
            return searchBST2(root.left, key);
        else  // key > root.val
            return searchBST2(root.right, key);
    }

    public static void main(String[] args) {
        Node root = null;

        root = insertInBST(root, 50);
        insertInBST(root, 30);
        insertInBST(root, 70);
        insertInBST(root, 10);
        insertInBST(root, 100);
        insertInBST(root, 1);


        TraversalUsingRecursion.inOrder(root);
        System.out.println();
        System.out.println(searchBST(root, 70));
        if(searchBST2(root, 70) == null)
            System.out.println("Not found");
        else
            System.out.println("found");
    }
}
