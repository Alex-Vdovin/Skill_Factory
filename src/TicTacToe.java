import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private String[][] field;
    private int count;
    private int turn;
    static Scanner sc = new Scanner(System.in);
    private boolean end;

    public TicTacToe() {
        newGame();
    }

    public String[][] getField() {
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.deepToString(field[i]));
        }
        return field;
    }

    public void newGame() {
        System.out.println("Let's Start Our Game!");
        field = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
        getField();
        System.out.println();
        count = 0;
        turn = 0;
        end = false;
    }

    public String checkGame() {
        if (field[0][0].equals(field[0][1]) && field[0][1].equals(field[0][2]) && field[0][2].equals("X") ||
                field[1][0].equals(field[1][1]) && field[1][1].equals(field[1][2]) && field[1][2].equals("X") ||
                field[2][0].equals(field[2][1]) && field[2][1].equals(field[2][2]) && field[2][2].equals("X") ||
                field[0][0].equals(field[1][0]) && field[1][0].equals(field[2][0]) && field[2][0].equals("X") ||
                field[0][1].equals(field[1][1]) && field[1][1].equals(field[2][1]) && field[2][1].equals("X") ||
                field[0][2].equals(field[1][2]) && field[1][2].equals(field[2][2]) && field[2][2].equals("X") ||
                field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && field[2][2].equals("X") ||
                field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && field[2][0].equals("X")
        ) {
            end = true;
            return "Player X won\nGame was ended\n";
        } else if (field[0][0].equals(field[0][1]) && field[0][1].equals(field[0][2]) && field[0][2].equals("0") ||
                field[1][0].equals(field[1][1]) && field[1][1].equals(field[1][2]) && field[1][2].equals("0") ||
                field[2][0].equals(field[2][1]) && field[2][1].equals(field[2][2]) && field[2][2].equals("0") ||
                field[0][0].equals(field[1][0]) && field[1][0].equals(field[2][0]) && field[2][0].equals("0") ||
                field[0][1].equals(field[1][1]) && field[1][1].equals(field[2][1]) && field[2][1].equals("0") ||
                field[0][2].equals(field[1][2]) && field[1][2].equals(field[2][2]) && field[2][2].equals("0") ||
                field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && field[2][2].equals("0") ||
                field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && field[2][0].equals("0")) {
            end = true;
            return "Player O won\nGame was ended\n";
        } else if (count == 9) {
            end = true;
            return "Draw";
        }
        return null;
    }

    public String makeMove(int x, int y) {
        if (checkGame() != null && end) {
            return "Game was ended";
        }
        if (x > 3 || x <= 0 || y > 3 || y <= 0) {
            getField();
            return "Impossible move\n";
        }
        if (turn % 2 == 0 && field[x - 1][y - 1].equals("-")) {
            field[x - 1][y - 1] = "X";
            turn++;
            count++;
            getField();
            if (checkGame() != null) {
                return checkGame();
            }
            return "Move completed\n";
        } else if (turn % 2 != 0 && field[x - 1][y - 1].equals("-")) {
            field[x - 1][y - 1] = "0";
            turn++;
            count++;
            getField();
            if (checkGame() != null) {
                return checkGame();
            }
            return "Move completed\n";
        }

        return "Cell " + x + ", " + y + " is already occupied\n";
    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();

        while (sc.hasNext()) {

            if (sc.hasNextInt()) {
                System.out.println(ttt.makeMove(sc.nextInt(), sc.nextInt()));
            } else {
                String start = sc.next();
                if(start.equals("new")){
                    ttt.newGame();
                }else if(start.equals("exit")){
                    System.exit(0);
                }else {
                    if (ttt.end) {
                        System.out.println("Game was ended");
                        sc.next();
                    }else {
                        System.out.println("Use correct input");
                        sc.next();
                    }
                }
            }


        }
    }
}
