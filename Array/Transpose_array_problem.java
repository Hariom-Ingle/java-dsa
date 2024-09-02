// package Array;

public class Transpose_array_problem {

    public  static  void TransposeMATRIX(int matrix[][]){

        int row=2;
        int col=4;

        // print matrix
        System.out.println("Orinal Matrix");
        printmatrix(matrix);

        int transpose [][]= new int [col][row];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Traspose  Matrix");
        printmatrix(transpose);
    }
    public  static  void printmatrix(int matrix[][] ){

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){

                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();

        }
        return;
    }

    public static void main(String[] args) {

        int matrix [][]={{1,2,3,4},
                {5,6,7,8}};

        TransposeMATRIX(matrix);


    }
}
