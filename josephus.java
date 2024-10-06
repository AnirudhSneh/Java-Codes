public class josephus {
    public static int Joseph(int n, int k){
        if(n==1){
            return 1;
        }
        return (Joseph(n-1, k) + k-1) % n+1;
    }
    public static void main(String args[]){
        System.out.println(Joseph(7,3));
        
    }
}
