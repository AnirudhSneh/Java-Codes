package Heap;
import java.util.*;

public class Heap {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){// TC = O(logn)
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;// xis child index.
            int par = (x-1)/2;// parent index

            while(arr.get(x) < arr.get(par)){//change < to > to get maxheap.
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){//This is for min heap.
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){//change > to < to get maxheap.
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){//change > to < to get maxheap.
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i , arr.get(minIdx));
                arr.set(minIdx , temp);

                heapify(minIdx);
            }


        }

        public int remove(){
            int data = arr.get(0);

            //Step 1 - Swap first and last.
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            
            //Step 2 - Delete Last.
            arr.remove(arr.size()-1);

            //Step 3 - Heapify.

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;

        }
    }
    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }

    
}
