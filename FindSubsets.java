public class FindSubsets {
    public static void findsubsets(String str, String ans , int i){//n elemnts have 2^n subsets and time taken for finding one subset is n.So TC = O(N*2^N) and SC = O(N).
        //base case
        if(i  == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //Yes choice
        findsubsets(str, ans + str.charAt(i), i+1);
        //No choice
        findsubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findsubsets(str, "", 0);
    }

}
