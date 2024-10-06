public class Forloop {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.println("Hello World");
        }
        for(int l=1;l<=4;l++){
            System.out.println("****");
        }

        //to get last digit of an number use num % 10.
        //to remove last digit of an number use num / 10.
        int a = 10899;
        while(a>0){
            int lastdigit = a%10;
            System.out.print(lastdigit);
            a = a/10;
        }//to print reverse of a number.
        int b = 19901;
        int rev = 0;
        while(b>0){
            int lastdigit = b%10;
            rev = (rev*10) + lastdigit;
            b = b/10;
        }
        System.out.println(rev);

    }
    
}
