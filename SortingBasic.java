import java.util.*;

public class SortingBasic {
    public static void PrintArr(Integer Arr[]){
        for(int i=0 ; i<Arr.length ; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
    //BUBBLE SORT.
    public static void BubbleSort(Integer Arr[]){//TC = O(n^2).
        for(int turn=0 ; turn<Arr.length-1 ; turn++){
            for(int j=0 ; j<Arr.length-1-turn ; j++){
                if(Arr[j] > Arr[j+1]){
                    int temp = Arr[j];//Swap
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            } 
        }
    }
    //SELECTION SORT.
    public static void SelectionSort(Integer Arr[]){//TC = O(n^2).
        for(int i=0 ; i<Arr.length-1 ; i++){
            int MinPos = i;
            for(int j=i+1 ; j<Arr.length ; j++){
                if(Arr[MinPos] > Arr[j]){// if (Arr[MinPos] < Arr[j])--> This will print sorted array in descending order.
                    MinPos = j;
                }
            }
            int temp = Arr[MinPos];
            Arr[MinPos] = Arr[i];
            Arr[i] = temp;

        }
    }
    //INSERTION SORT.
    public static void InsertionSort(Integer Arr[]){//TC = O(n^2).
        for(int i=1 ; i<Arr.length ; i++){
            int curr = Arr[i];
            int prev = i-1;
            //finding out the correct position to insert.
            while(prev >= 0 && Arr[prev] > curr){
                Arr[prev+1] = Arr[prev];
                prev--;
            }
            //insertion.
            Arr[prev+1] = curr;
        }
    }
    //COUNTING SORT.
    public static void CountingSort(Integer Arrr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<Arrr.length ; i++){
            largest = Math.max(largest,Arrr[i]);
        }
        int count[] = new int[largest+1];//This count array stores how many times a number is repeated.
        for(int i=0 ; i<Arrr.length ; i++){
            count[Arrr[i]]++;
        }
        //Sorting
        int j=0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0){
                Arrr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Integer Arr[] = {5,4,1,3,2};
        Integer Arrr[] = {1,4,1,3,2,4,3,7};
        //BubbleSort(Arr);
        //PrintArr(Arr);
        //SelectionSort(Arr);
        //PrintArr(Arr);
        //InsertionSort(Arr);
        //PrintArr(Arr);
        CountingSort(Arrr);
        PrintArr(Arrr);
        Arrays.sort(Arr,0,3);//This will sort array between index 0 and 2 bcz it is exclusive.
        PrintArr(Arr);
        Arrays.sort(Arr);//Inbuilt Sort[TC = O(nlogn) < O(n^2)].
        PrintArr(Arr);
        Arrays.sort(Arr,0,3,Collections.reverseOrder());
        PrintArr(Arr);
        Arrays.sort(Arr,Collections.reverseOrder());//The reverseOrder function always works on objects and (int Arr) was of primitive type,as we know there are two types of data type primitive and object.
        PrintArr(Arr);
        
    }
}
