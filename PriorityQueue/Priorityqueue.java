package PriorityQueue;
import java.util.*;

public class Priorityqueue {
    //syntax for comparing objects of same class within the class.
    static class Student implements Comparable<Student> {//The Comparable interface is used to compare an object of the same class with an instance of that class, it provides ordering of data for objects of the user-defined class.
        String name;
        int rank;

        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override //In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//sorts element in descending order.
        
        pq.add(3);//O(LOGN)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(LOGN)
        }

        PriorityQueue<Student> st = new PriorityQueue<>();
        st.add(new Student("A" , 4));
        st.add(new Student("B" , 5));
        st.add(new Student("C" , 2));
        st.add(new Student("D" , 12));

        while(!st.isEmpty()){
            System.out.println(st.peek().name + " --> " + st.peek().rank);
            st.remove();
        }
    }
    
}
