package BinarySearchTree;
import java.util.*;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }
        else{
            //right subtree
            root.right = insert(root.right , val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root , int key){//TC = O(H).
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return Search(root.left, key);
        }
        else{
            return Search(root.right, key);
        }
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root , int val){
        if(root.data < val){
            root.right = Delete(root.right , val);
        }
        else if(root.data > val){
            root.left = Delete(root.left, val);
        }
        else{//Case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2 - Single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //Case 3 -both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right , IS.data);
        }
        return root;
    }

    public static void PrintInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <=k2){
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            PrintInRange(root.left, k1, k2);
        }
        else{
            PrintInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size() ; i++){
            System.out.print(path.get(i) + "-->");
        }
        System.out.println("Null");
    }

    public static void printRRootToLeaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRRootToLeaf(root.left, path);
        printRRootToLeaf(root.right, path);
        path.remove(path.size() -1);

    }

    public static boolean isValidBST(Node root , Node min , Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0 ; i<values.length; i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        if(Search(root, 1)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

       // root = Delete(root,5);
        System.out.println();
       // inorder(root);
        System.out.println();
        PrintInRange(root, 5, 12);
        System.out.println();
        printRRootToLeaf(root, new ArrayList<>());
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
