import java.util.*;

public class Matrices {

    public static boolean Search(int matrix[][] , int key){//TC=O(n^2).
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i +","+ j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int m = matrix.length , n = matrix[0].length;

        try(Scanner sc = new Scanner(System.in)){
            for(int i=0; i<m ; i++){
                for(int j=0 ; j<n ; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            for(int i=0 ; i<m ; i++){
                for(int j=0; j<n ; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        Search(matrix , 5);
    }
}
