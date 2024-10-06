public class FunctionOverloading {
    //function overloading using parameters.
    public static int Sum(int a , int b){//function to calculate sum of two numbers.
        return a + b;
    }
    public static int Sum(int a , int b , int c){//function to calculate sum of three numbers.
        return a + b + c;
    }
    //function overloading using datatypes.
    public static float Sum(float a ,float b){/*if we write float Sum(int a,int b) ,it will show error regarding same functions because
        function overloading does not depend on return type. */
        return a + b;
    }
    public static boolean isprime(int n){

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(Sum(10,7));
        System.out.println(Sum(8,9,15));
        System.out.println(Sum(2.3f,3.2f));
        System.out.println(isprime(2));
    }
    
}
