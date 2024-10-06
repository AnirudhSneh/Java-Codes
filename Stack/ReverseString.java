import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return str = result.toString();//it is used bcz StringBuilder and String are different. So, we need to conver SB to String.
    }

    public static void main(String args[]){
        
        System.out.println(reverseString("abc"));
        System.out.println(reverseString("AnirudhSneh"));
    }
}
