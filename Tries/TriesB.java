package Tries;

public class TriesB {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26]; // a to z
            for(int i=0 ; i<26 ; i++){
                children[i] = null;
            }
            eow = false;
        }
    }   
    static Node root = new Node();

    public static void mian(String args[]){
        //String words[] = {"the" , "a" , "there" , "thier" , "any"};
    }
}
