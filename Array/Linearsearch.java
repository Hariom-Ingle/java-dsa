// package Array;

// import com.sun.source.tree.BreakTree;

public class Linearsearch {

    public  static int linearSearch( int arr[], int key){

        for (int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,2,5,10,20,56,89,6};
        int key =10;
         int  index= linearSearch(arr,key);
         if(index == -1){
             System.out.println("Not Found ");
         }
         else {
             System.out.println("key at index :"+index);
         }
//        System.out.println("Not Found ");
    }

}
