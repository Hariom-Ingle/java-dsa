package GreedyAlgo;
import java.util.*;

public class fractionalKnapsack {

public static void main(String[] args) {
    
    int val []= {60,100,120};
    int weight[]={10,20,30};
    int w=50;

    double ratio[][]= new double [val.length][2];

    for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)(weight[i]);
        
    }
    // assending Order 
    Arrays.sort(ratio ,Comparator.comparingDouble(o->o[1]));
  

    int capacity=w;
    int finalVal=0;

    for (int i = val.length-1;i>=0;i--){
        int idx= (int)ratio[i][0]; /// to track the ratio stored at index in the ratio array;

        if(capacity>=weight[idx]){
            finalVal+=val[idx];
            capacity-=weight[idx];

        }else{
            finalVal+=(ratio[i][1]*capacity);
            capacity=0;
            break;
        }

    }
    System.out.println(finalVal);

}
    
    
}



// //package GreedyAlgo;
// import java.util.*;

// public class FractionalKnapsack {

//     public static void main(String[] args) {
//         int[] val = {60, 100, 120};
//         int[] weight = {10, 20, 30};
//         int w = 50;

//         double[][] ratio = new double[val.length][2];

//         // Compute value-to-weight ratio and store index
//         for (int i = 0; i < val.length; i++) {
//             ratio[i][0] = i; // Index
//             ratio[i][1] = val[i] / (double) weight[i]; // Value-to-weight ratio
//         }

//         // Sort the ratio array in descending order based on the ratio
//         Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

//         int capacity = w;
//         double finalVal = 0;

//         // Calculate maximum value
//         for (int i = 0; i < ratio.length; i++) {
//             int idx = (int) ratio[i][0]; // Original index of the item
//             int currentWeight = weight[idx];
//             int currentValue = val[idx];

//             if (capacity >= currentWeight) {
//                 // If we can take the whole item
//                 finalVal += currentValue;
//                 capacity -= currentWeight;
//             } else {
//                 // Take fraction of the item
//                 finalVal += ratio[i][1] * capacity;
//                 capacity = 0;
//                 break; // No more capacity left
//             }
//         }

//         // Output the result
//         System.out.println("Maximum value in the knapsack: " + finalVal);
//     }
// }
