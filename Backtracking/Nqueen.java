package Backtracking;

import java.sql.SQLOutput;

public class Nqueen {


    static  int count =0;
    public  static void Nqueensol( char board[][],int row ){
        //
        if ( row   == board.length){
            System.out.println("+++++++++++++++ N Queen Solution :" +(++count)+"  ++++++++++++++++++");
            printboard(board);
            return;
        }
        for (int j =0; j< board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                Nqueensol( board,row+1);
            }
            board[row][j] = '.';
        }
    }


    public static  void printboard( char board[][]){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j] +"  " );
            }
            System.out.println();
        }
    }

    public static  boolean isSafe( char board [][],int row , int  col){

        //Upside
        for (int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        int n=4;

        char board [][]=new char [n][n];
        for (int i = 0; i > n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // Use single quotes for char
            }
        }
        int row=0;
//        printboard(board);
        Nqueensol(board, row);

    }
}
