import java.util.*;
public class Strings {

    public static void PrintLetters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String str){//TC=O(n).
        for(int i=0 ; i<str.length()/2 ; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome.
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
       // char arr[] = {'a','b','c','d'};
       // String str = "abcd";
       // String str2 = new String("xyz");
       //In Java Strings are IMMUTABLE.

        try(Scanner sc = new Scanner(System.in)){
            String name;
           // name = sc.next();it doesn't print full sentence.
            name = sc.nextLine();//it will print whole line.
            System.out.println(name);
            String Name = "Tony Stark";
            System.out.println(Name.length());//we dont use paranthesis after array.length but use here bcz string is a function.
            String firstname = "Anirudh";
            String lastname = "Sneh";
            String FullName = firstname + " " + lastname;
            System.out.println("Mera naam hai " + FullName );
            System.out.println(FullName.charAt(0));//charAt tells the letter at that index.
            PrintLetters(FullName);
            String str = "RACECAR";
            System.out.println(isPalindrome(str));

            String S1 = "Tony";
            String S2 = "Tony";
            String S3 = new String("Tony");
            if(S1 == S2){
                System.out.println("Strings are equal");
            }
            else{
                System.out.println("Strings are not equal");
            }
            if(S1 == S3){
                System.out.println("Strings are equal");
            }
            else{
                System.out.println("Strings are not equal");
            }

            if(S1.equals(S3)){
                System.out.println("Strings are equal");
            }
            else{
                System.out.println("Strings are not equal");
            }/*== it checks value at an object level and S3 was declared as new string so the value it contains is new,
            but S1.equals(S3) comapres the value it contains regardless of how they are declared.*/        
        }
    }
}
