public class GetShortest_Path {
    
    public static float ShortestPath(String Path){
        int x=0 , y=0;
        for(int i=0 ; i<Path.length() ; i++){
            char direc = Path.charAt(i);
            //North
            if(direc == 'N'){
                y++;
            }
            //South
            else if(direc == 'S'){
                y--;
            }
            //East
            else if(direc == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2 + Y2));
    }
    public static void main(String args[]){
        String Path = "WNEENESENNN";
        System.out.println(ShortestPath(Path));
    }
}
