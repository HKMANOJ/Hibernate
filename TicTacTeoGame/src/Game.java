import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char Player='X';
        boolean isGameOver=false;
        Scanner sc=new Scanner(System.in);
        while (!isGameOver){
            printBoard(board);
            System.out.println("player"+" "+Player+" "+"enter");
            int ro=sc.nextInt();
            int co=sc.nextInt();

            if(board[ro][co]==' '){
                board[ro][co]=Player;
                isGameOver=haveWon(board,Player);
                if (isGameOver){
                    System.out.println("Congradulations"+" "+Player+" "+"has WON"+"  "+"the GAME");
                }else{
                    if (Player=='X'){
                        Player='O';
                    }else {
                        Player='X';
                    }
                }
            }else {
                System.out.println("invalid move check empty space");
            }
        }
        printBoard(board);
    }


    private static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0]==player && board[row][1]==player && board[row][2]==player) return true;
        }
        for (int col = 0; col < board.length; col++) {
            if (board[0][col]==player && board[1][col]==player && board[2][col]==player) return true;
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
