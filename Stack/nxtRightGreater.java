package Stack;

import java.util.Stack;

public class nxtRightGreater{
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        int arr []={1,8,6,3,2,1};
        int nxtInterger []= new  int [arr.length];
        
        // for loop  Step: 
        for( int i=arr.length-1;i>=0;i--){

            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();


                
            }
            if(s.isEmpty()){
                nxtInterger[i]=-1;
            }else{
                nxtInterger[i]=arr[s.peek()];
            }
            s.push(i);
        }

        for( int i = 0; i<nxtInterger.length;i++){
            System.out.print(nxtInterger[i]+" " );
        }
        System.out.println();

        
    }
}