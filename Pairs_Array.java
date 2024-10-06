public class Pairs_Array {
    public static void Pairs(int Numbers[]){//Time complexity = O(n^2).
        int tp=0;
        for(int i=0 ; i<Numbers.length ; i++){
            for(int j=i+1 ; j<Numbers.length ; j++){
                System.out.print("(" + Numbers[i] + "," + Numbers[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs are : " + tp);
    }
    public static void main(String args[]){
        int Numbers[] = {2,4,6,8,10,12};
        Pairs(Numbers);
    }//formula to find tp = n*(n-1)/2;for 6 elemnts-> first there will be 5 pairs then 4+3+2+1.
    //So, Sum of n terms is n*(n+1)/2 anf for (n-1)terms -> (n)*(n-1)/2.
    
}
