import java.util.Scanner;

public class Tittac {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n Lets play TicTac \n\n");
        char[][] playGround = {
             {'-', '-', '-'},
             {'-', '-', '-'},
             {'-', '-', '-'}
        };

        playBoard(playGround);

        for(int i = 0; i <= 8; i++){
            if(i %  2 ==  0){
                System.out.println("Turn: X");
                int[] spot = askUser(playGround);
                playGround[spot[0]][spot[1]] = 'X';

            }else{
                System.out.println("Turn: O");
                int[] spot = askUser(playGround);
                playGround[spot[0]][spot[1]] = 'O';
            }
            playBoard(playGround);

            int count = checkWin(playGround);

            if(count == 3){
                System.out.println("X wins");
                break;
            }else if(count == -3){
                System.out.println("O Wins");
                break;
            }else if(i = 8){
                System.out.println("A tie");
            }
        }
        
        scan.close();
    }

    public static void playBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            System.out.print("\t");
            for(int m = 0; m < board[i].length; m++){
                System.out.print(board[i][m] + "  ");
            }
            System.out.print("\n\n");
        }

       
    }

    public static int[] askUser(char[][] board){
        System.out.print("  . Pick the row and the column: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        while(board[row][element] != '-'){
            System.out.print("Spot taken, Try Again: ");
            row = scan.nextInt();
            element = scan.nextInt();
        }
        return new int[] {row, element};
        
    }

    public static int checkWin(char[][] board) {
       int count = 0;
       for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
            if(board[i][j] == 'X'){
                count++;
            }else if(board[i][j] == 'O'){
                count--;
            }
            
        }
        if(count == 3 || count == -3){
            return count;
        }else{
            count = 0;
        }
        
       }

       for(int i = 0; i < board.length; i++){
        for(int j = 0; j <board[i].length; j++){
            if(board[j][i] == 'X'){
                count++;
            }else if(board[j][i] == 'O'){
                count--;
            }
        }
        if(count == 3 || count == -3){
            return count;
        }else {
            count = 0;
        }
       }

       for(int i = 0; i < 3; i++){
        if(board[i][i] == 'X'){
            count++;
        }else if(board[i][i] == 'O'){
            count--;
        }

       }
       if(count == 3 || count == -3){
        return count;
      }else {
        count = 0;
      }

      for(int i = 0; i < board.length; i++){
            int j = 2 - i;
            if(board[i][j] == 'X'){
                count++;
            } else if(board[i][j] == 'O'){
                count--;
            }
      }
      if(count ==3 || count == -3){
        return count;
    }else {
        count = 0;
    }
    return count;
       
    }

    
}
