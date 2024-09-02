// package Array;

public class StarecaseSearch2Darray {


    public  static boolean Staircasesearch( int matrix[][], int key){
//        int row=0;
//        int col=matrix.length-1;
//
//        // this cod is for the rigth topmost  element search will start from there
//        while(col>=0 && row <matrix.length){
//            if(matrix[row][col]==key ) {
//                System.out.println("Search element fount at (" + row + "," + col + ")");
//                return true;
//            }
//             else if(key <matrix[row][col] ){
//                col--;
//            }else{
//                row ++;
//            }
//
//        }
//        System.out.println(" Seach Key Not Found");
//        return false;

        int row=matrix.length-1;
        int col=0;

        // this cod is for the rigth topmost  element search will start from there
        while(row>=0 && col <matrix.length){
            if(matrix[row][col]==key ) {
                System.out.println("Search element fount at (" + row + "," + col + ")");
                return true;
            }
            else if(key <matrix[row][col] ){
                row--;
            }else{
                col ++;
            }

        }
        System.out.println(" Seach Key Not Found");
        return false;
    }
    public static void main(String[] args) {

        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=32;


Staircasesearch(matrix,key);
    }
}
