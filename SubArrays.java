public class SubArrays {
    public static void PrintSubArrays(int Numbers[]){
        int ts = 0;
        for(int i=0 ; i<Numbers.length ; i++){
            int start = i;
            for(int j=i ; j<Numbers.length ; j++){
                int end = j;
                for(int k=start ; k<=end ; k++){
                    System.out.print(Numbers[k] + " ");
                }
                ts++;
                System.out.println();
                }
            }
            System.out.println();
        
        System.out.println("Total number of subarrays are : " + ts);
    }

    public static void main(String args[]){
        int Numbers[] = {2,4,6,8,10};
        PrintSubArrays(Numbers);
    }//If there is n sized array then total number of subarrays are ->(n)*(n+1)/2.
    
}
