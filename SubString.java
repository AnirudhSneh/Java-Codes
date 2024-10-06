public class SubString {
    public static String Substring(String str , int si , int ei){
        String substr = "";
        for(int i = si ; i < ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //Substring
        String str = "HelloWorld";
        System.out.println(Substring(str, 0 , 5));

        System.out.println(str.substring(0,5));//inbuilt java function.

        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=1 ; i<fruits.length ; i++){//TC=O(x*N)
            if(largest.compareTo(fruits[i]) < 0){//< 0 case where largest will be smaller than fruits[i].
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
