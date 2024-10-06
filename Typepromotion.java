public class Typepromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);//here type promotion does not because it is written as normal variable.
        System.out.println(b-a);//type promotion only happens when + - etc are used.
       // char c = a - b; it gives an error because a-b becomes an integer and cannot be converetd into charachter.
    //short,byte and char are promoted to integer.
        int e = 10;
        float r = 20.25f;
        long c = 25;
        double d = 30;
        double ans = e+r+c+d;//if double is biggest data type present then all value will be converted into double.
        System.out.println(ans);
    }

}    

