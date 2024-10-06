public class FindPermutation {
    public static void findpermutation(String str , String ans){//TC = O(N*N!)
        //base case.
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion.
        for(int i=0 ; i<str.length() ; i++){
            char Curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String Newstr = str.substring(0,i) + str.substring(i+1);
            findpermutation(Newstr, ans+Curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findpermutation(str, "");
    }
    
}
