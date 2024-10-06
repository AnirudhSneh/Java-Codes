public class Reverse_Array {
    public static void reverse(int Numbers[]){
        int first = 0 , last = Numbers.length-1;
        while( first < last){
            int temp = Numbers[last];
            Numbers[last] = Numbers[first];
            Numbers[first] = temp;
            first++;
            last--;
        }
        for(int i=0 ; i<Numbers.length ; i++){
            System.out.print(Numbers[i] +" ");
        }
    }
    public static void main(String args[]){
        int Numbers[] = {2,4,6,8,10,12};
        reverse(Numbers);
    }
}
