public class TrappedRainwater {//Time Complexity = O(n).
    public static int TR(int Height[]){
        int n = Height.length;
        int LeftMax[] = new int[n]; 
        LeftMax[0] = Height[0];
        for(int i=1 ; i<n ; i++){
            LeftMax[i] = Math.max(Height[i] , LeftMax[i-1]);
        }
        int RightMax[] = new int[n];
        RightMax[n-1] = Height[n-1];
        for(int i=n-2; i>=0 ; i--){
            RightMax[i] = Math.max(Height[i] , RightMax[i+1]);          
        }
        int TrappedWater = 0;
        for(int i=0 ; i<n ; i++){
            int WaterLevel = Math.min(LeftMax[i] , RightMax[i]);
            TrappedWater += WaterLevel - Height[i]; //Multiply the whole by width but here width is 1, so there is no need to write it.
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        int Height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Rainwater is : " + TR(Height));
    }
    
}
