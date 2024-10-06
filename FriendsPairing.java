public class FriendsPairing {
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice > Single.
        int fnm1 = friendspairing(n-1);

        //Pair.
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1)*fnm2;

        //total ways.
        int totways = fnm1 + pairways;
        return totways;
    }//or we can return friendspairing(n-1) + (n-1)*friendspairing(n-2);and remove fnm1 , fnm2 and pairways.
    public static void main(String args[]){
        System.out.println(friendspairing(3 ));
    }
}
