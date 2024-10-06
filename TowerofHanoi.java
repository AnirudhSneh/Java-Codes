public class TowerofHanoi {
    public static void towerofhanoi(int n , char src , char dest , char help){
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+ dest);
            return;
        }
        towerofhanoi(n-1, src, help, dest);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1, help, dest, src);
    }
    public static void main(String args[]){
        towerofhanoi(3, 'A', 'C', 'B');
    }
}
 