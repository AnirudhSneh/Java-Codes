import java.util.*;

public class Function {
    public static int printHelloWorld(){//function prototype and definition.
        System.out.println("Hello World");
        return 0;//if the return type is void,one doesn't have to return any value.You can just write return;.
    }
    public static void Sum(int num1,int num2){//num1 and num2 are formal parameters.
        
            int sum = num1 + num2;
            System.out.println("Sum is : " + sum);
        
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
        printHelloWorld();//function call.
        Sum(a,b);//a and b are argumnts or actual parameters.
        }
    }

}