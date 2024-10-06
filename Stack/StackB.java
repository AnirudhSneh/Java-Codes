public class StackB {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        /*static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push-> O(1)
        public void push(int data){
            list.add(data);
        }

        //pop-> O(1)
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek-> O(1)
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }*/
        static Node head = null;
        public boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }//removed static from all the functions.
    public static void main(String args[]){
        //Stack<Integer> S = new Stack<>(); also import java.util.*;
        Stack S = new Stack();
        S.push(1);
        S.push(2);
        S.push(3);

        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }

    }
    
}
