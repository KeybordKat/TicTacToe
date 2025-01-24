// imports:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5 elements in each row in array, 3 for x and o's, 2 for separating lines
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        char[][] boardInstructions = {
                {'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'}
        };
        // Instructions
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        printGameBoard(boardInstructions);
        System.out.println();
        System.out.println("""
                Select a number between 1 and 9 to determine your tile placement\s
                according to the chart above.
                """);
        printGameBoard(gameBoard);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your placement: ");
        int pos = sc.nextInt();
        // print position for testing purposes
        System.out.println(pos);


    }

    public static void printGameBoard(char [] [] gameBoard) {
        // print character by character row by row
        for (char[] row : gameBoard) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void placePiece(char [] [] gameBoard, int pos, String user) {

        // default character set to x
        char symbol = 'x';
        if(user.equals("player")) {
            symbol = 'x';
        } else if(user.equals("cpu")) {
            symbol = 'o';
        }
        // places x or o based on given position
        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
        }

        printGameBoard(gameBoard);
    }
}
