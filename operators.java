public class operators {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A+B));
        System.out.println("sub = " + (A-B));
        System.out.println("mult = " + (A*B));
        System.out.println("div = " + (A/B));
        System.out.println("modulo = " + (A%B));
        int C = 15;
        int D = ++C;
        System.out.println(C);
        System.out.println(D);
        int E = 10;
        int F = E++;
        System.out.println(E);
        System.out.println(F);
        System.out.println(F==E);
        System.out.println(F!=E);
        System.out.println(F>=E);
        System.out.println(F<=E);
        System.out.println(F>E);
        System.out.println(F<E);
        System.out.println((5>2) && (10 > 9));
        System.out.println((5<2) || (6<8));
        System.out.println(!((5<2) || (6<8)));
        System.out.println(F += 10);
        System.out.println(F -= 10);
        System.out.println(F /= 10);
        System.out.println(F *= 10);
        System.out.println(F %= 10);

        /*Ternary operator:  variable = condition ? statement 1 : statement 2; */
        int number = 4;
        String type = ((number%2)==0) ? "even" : "odd";
        System.out.println(type);
    }
    
}
