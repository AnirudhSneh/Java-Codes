import java.util.LinkedList;
public class LinkListCF {
    public static void main(String args[]){
        //Create objects
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);


    }
    
}
