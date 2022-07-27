//        1) newGame() — ничего не возвращающий метод, должен создать новую игру;

//        2) getField() — метод должен вернуть двумерный массив — поле игры;

//        3) checkGame() — метод должен определить есть ли победитель в игре, если да,
//        то вернуть X/0 в зависимости от того, кто победил, если победителя нет, то метод
//        должен вернуть D (ничья), если игра ещё продолжается, то вернуть строку null;

//        4) makeMove(int x, int y), принимающий два параметра — ряд и столбик, куда игрок хочет сделать ход.

//        4.1) Если ход невозможен (клетка уже занята), то метод должен вернуть строку вида {Cell x, y is already occupied}.
//        4.2) Если же ход возможен, то в поле следует поставить X или 0 (зависит от того, кто сейчас ходил), и вернуть строку Move completed,
//        если после этого хода игра не заканчивается.
//        4.3) Если же этим ходом победил один из игроков, то метод должен вернуть строку вида {Player X/0 won}.
//        4.4) Если же после этого хода свободных клеток не осталось, а победителя нет, то метод должен вернуть Draw.
//        4.5) Если игра уже завершена (выявлен победитель или ничья), но кто-то хочет походить дальше, то метод должен вернуть Game was ended.


import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeEnhanced {
    private String [][] field;
    private int turn;
    private int count;
    private boolean end;
    static Scanner sc = new Scanner(System.in);
    public TicTacToeEnhanced(){
        newGame();
    }
    public void newGame(){
        field = new String[][]{{"-","-","-"}, {"-","-","-"}, {"-","-","-"}};
        System.out.println("Welcome to TicTacToe Game!");
        getField();
        turn = 0;
        count = 0;
        end = false;
    }
        public String[][] getField(){
            for(int i=0;i< field.length;i++){
                System.out.println(Arrays.deepToString(field[i]));
            }
        return field;
        }
        public String checkGame(){
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
                return "X";
            } else if (field[0][0].equals(field[0][1]) && field[0][1].equals(field[0][2]) && field[0][2].equals("0") ||
                    field[1][0].equals(field[1][1]) && field[1][1].equals(field[1][2]) && field[1][2].equals("0") ||
                    field[2][0].equals(field[2][1]) && field[2][1].equals(field[2][2]) && field[2][2].equals("0") ||
                    field[0][0].equals(field[1][0]) && field[1][0].equals(field[2][0]) && field[2][0].equals("0") ||
                    field[0][1].equals(field[1][1]) && field[1][1].equals(field[2][1]) && field[2][1].equals("0") ||
                    field[0][2].equals(field[1][2]) && field[1][2].equals(field[2][2]) && field[2][2].equals("0") ||
                    field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && field[2][2].equals("0") ||
                    field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && field[2][0].equals("0")) {
                end = true;
                return "0";
            } else if (count == 9) {
                end = true;
                return "D";
            }
            return null;
        }
        public String makeMove(int x, int y){
        if(end){
            return "Game was ended";
        }else if(field[x-1][y-1].equals("-")){
            if(turn%2==0){
                field[x-1][y-1]="X";
                turn++;
                count++;
                getField();
                if(checkGame()==null){
                    return "Move completed";
                }
            }else if(turn%2!=0){
                field[x-1][y-1]="0";
                turn++;
                count++;
                getField();
                if(checkGame()==null){
                    return "Move completed";
                }
            }
        }else if(field[x-1][y-1].equals("X")||field[x-1][y-1].equals("0")){
            return "Cell "+x+", "+y+" is already occupied";
        }
            if(checkGame()=="X"){
                end = true;
                return "Player X won";
            }else if(checkGame()=="0"){
                end = true;
                return "Player 0 won";
            }else if(checkGame()=="D"&&count==9){
                end = true;
                return "Draw";
            }
        return null;
        }
    public static void main(String[] args) {
        TicTacToeEnhanced ttt = new TicTacToeEnhanced();
        while(sc.hasNextInt()){
            System.out.println(ttt.makeMove(sc.nextInt(), sc.nextInt()));
            ttt.checkGame();
        }
    }
}