// package Array;

public class trappingrainwater {
    public static void trappingsolution(int height[]){
        int n=height.length;
        int leftmost[]= new int [n];
        leftmost[0]=height[0];
      //find leftmost
        for (int i=1;i<n;i++){

            leftmost[i]=Math.max(height[i],leftmost[i-1]);
        }


        int rightmost[]=new int [n];
        rightmost[n-1]=height[n-1];
        //find leftmost
        for (int i=n-2;i>=0;i--){
            rightmost[i]=Math.max(height[i],rightmost[i+1]);
        }

        int trappdwaterlevel=0;
        // loop to find height
        for(int i=0;i<n;i++){

            // calculate the waterlevel of the  given bar
            int waterlevel=Math.min(leftmost[i],rightmost[i]);

//            calculate trappped waterlevel
            trappdwaterlevel+=waterlevel-height[i];
        }

        System.out.printf("trapedwaterlevel  "+trappdwaterlevel);

        return;
    }
    public static void main(String[] args) {
        int input[]={4,2,0,6,3,2,5};

        trappingsolution(input);

    }
}