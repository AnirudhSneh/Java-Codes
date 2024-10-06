public class GridWays {
    public static int GW(int i ,int j, int n ,int m){/*Right turns = no. of cols => m , Down turns = no. of rows => n.
        //base case                                  amd we have two choices either to go right or down. So TC = O(2^n+m)*/
        if(i == n-1 && j == m-1){//condition for last cell.
            return 1;
        }
        else if(i == n || j == m){//boundary condition.
            return 0;
        }

        int w1 = GW(i+1, j, n, m);//Right
        int w2 = GW(i, j+1, n, m);//Down
        return w1+w2;
    }
    public static void main(String args[]){//Grid Ways can be solved in linear time complexity using permutation.
        int n = 3 , m = 3;
        System.out.println(GW(0, 0, n, m));
    }
}
