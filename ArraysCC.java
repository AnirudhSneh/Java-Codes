import java.util.*;
public class ArraysCC {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int marks[] = new int[10];

            marks[0] = sc.nextInt();//phy
            marks[1] = sc.nextInt();//chem
            marks[2] = sc.nextInt();//math

            System.out.println("phy : " + marks[0]);
            System.out.println("chem : " + marks[1]);
            System.out.println("math : " + marks[2]);
            marks[2] = marks[2] + 2;
            System.out.println("math : " + marks[2]);
            float percentage = (marks[0]+marks[1]+marks[2])/3f;
            System.out.println("Percentage : " + percentage +"%");
            System.out.println("Length of array = "+ marks.length);
        }
    }
    
}
