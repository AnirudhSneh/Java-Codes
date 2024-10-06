import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        

        System.out.println(list1);
        //Get element
        System.out.println(list1.get(2));
        //Delete
        list1.remove(2);
        System.out.println(list1);
        //Set element
        list1.set(2,10);
        System.out.println(list1);
        //Contains element
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(20));
        list1.add(2,9);
        System.out.println(list1);
        System.out.println(list1.size());
        //print the arraylist
        for(int i=0 ; i<list1.size() ; i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        //print reverse
        for(int i=list1.size()-1 ; i>=0 ; i--){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        //To print maximum element in a list.
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list1.size() ; i++){
            if(max < list1.get(i)){// or we can write max = Math.max(max,list.get(i));
                max = list1.get(i);
            }
        }
        System.out.println("Max element is : " + max);

        int idx1 = 1 , idx2 = 2;
        System.out.println(list1);
        swap(list1, idx1, idx2);
        System.out.println(list1);
        Collections.sort(list1);// Collections is class and Collection is a interface.
        System.out.println(list1);//Collections.sort() will print in ascending order.
        //In descending order.
        Collections.sort(list1 , Collections.reverseOrder());
        System.out.println(list1);//Collections.reverseOrder() is a comparator where comparator is a function which defines the logic for sorting.
        

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4) ; list2.add(7) ; list2.add(11) ; list2.add(9);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10) ; list3.add(19) ; list3.add(24) ; list3.add(27);
        mainList.add(list3);
        
        for(int i=0 ; i<mainList.size() ; i++){
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j=0 ; j<currlist.size() ; j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
    
}
