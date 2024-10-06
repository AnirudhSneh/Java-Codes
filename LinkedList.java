public class LinkedList {
    public static class Node{
        int data;//value
        Node next;//address of next node.

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){//TC = O(1).
        //Step 1 --> Create a new node.
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2--> newNode next = head.
        newNode.next = head; //link

        //Step 3 --> head = newNode.
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;        
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx -1){
            temp = temp.next;
            i++;
        }

        //i = idx-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;//The first node will be deleted by the inbuilt garabge collector as there will be no way to access that node once it is removed from head.
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2;
        Node prev = head;
        for(int i=0 ; i< size-2 ; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // or tail.data.
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){//O(n).
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){//key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head ,int key){//TC = O(n) = SC
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;//Assignment in java is from right to left, So head goes to tail and tail goes to current.
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromEnd(int n){//We cannot start loop from tail bcz we can't traverse linklist from tail,we can only traverse it from head.
        //calculate the size.
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;//Remove First
            return;
        }
        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){//Slow Fast Approach.
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//slow is my middle.
    }

    public Boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //Step 1 -> find mid.
        Node midNode = findMid(head);

        //Step 2 -> reverse 2nd half.
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head.
        Node left = head;

        //Step 3 -> check the left and right half.
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){//Floyds cycle finding algorithm.
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true;//cycle exist
            }
        }
        return false;//cycle does not exist.
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle --> last.next = null
        prev.next = null;
    }
    //----------------------------------------------
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid Node.
    }

    private Node Merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node MergeSort(Node head){//TC = O(nlogn).
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        //Merge
        return Merge(newLeft,newRight);
    }
    //------------------------------------------

    public void ZigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node leftH = head;
        Node rightH = prev;
        Node nextL , nextR;
        //alternate merging - zig zag merge

        while(leftH != null && rightH != null){
            nextL = leftH.next;//Zig_zag
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;          

            leftH = nextL;//update
            rightH = nextR;
        }

    }
    


    public static void main(String args[]){
        LinkedList ll = new LinkedList();        
       /* ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.add(2,3);

        ll.print();
        System.out.println(LinkedList.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.itrsearch(4));
        System.out.println(ll.itrsearch(10));
        System.out.println(ll.recSearch(4));
        
        ll.reverse();
        ll.deleteNthfromEnd(2);
        ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2; 

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        ll.print();*/
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1
        ll.print();
        LinkedList.head = ll.MergeSort(LinkedList.head);
        ll.print();
        ll.ZigZag();
        ll.print();
        
    }
    
}
