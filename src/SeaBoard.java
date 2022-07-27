import java.util.Arrays;
import java.util.Scanner;

public class SeaBoard {
    private String[][] field = new String[10][10];

    public String[][] getField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    System.out.print(field[i][j]);
                    System.out.println();
                } else {
                    System.out.print(field[i][j]);
                }
            }
        }
        return field;
    }

    public void shoot(int line, int column, String issue) {
        if (issue.equals("m")) {
            field[line][column] = "#";
        } else if (issue.equals("h")) {
            field[line][column] = "x";
        } else if (issue.equals("d")) {
            field[line][column] = "x";
//            for (int i = column; i < field.length; i++) {
//                if (field[line][i].equals("x")) {
//                    if (line != 0 && line != 9) {
//                        field[line - 1][i] = "#";
//                        field[line + 1][i] = "#";
//                    } else if (line == 0) {
//                        field[line + 1][i] = "#";
//                    } else {
//                        field[line - 1][i] = "#";
//                    }
//                } else if (field[line][i].equals(".")||field[line][i].equals("#")) {
//                    if (line == 0 && i == 0) {
//                        field[1][1] = field[0][1] = "#";
//                        break;
//                    } else if (line == 0 && i != 0 && i != 9) {
//                        field[line + 1][i] = "#";
//                        field[line][i] = "#";
//                        field[line + 1][i-1] = "#";
//                        break;
//                    } else if (line == 0 && i == 9) {
//                        field[line + 1][i] = "#";
//                        break;
//                    } else if (line == 9 && i == 0) {
//                        field[8][0] = field[8][1] = field[9][1] = "#";
//                        break;
//                    } else if (line == 9 && i == 9) {
//                        field[8][9] = "#";
//                        break;
//                    } else if (line != 0 && i != 0) {
//                        field[line - 1][i] = "#";
//                        field[line + 1][i] = "#";
//                        field[line][i] = "#";
//                        break;
//                    }
//                }
//            }
//
//            for (int i = column; i >=0; i--) {
//                if (field[line][i].equals("x")) {
//                    if (line != 0 && line != 9) {
//                        field[line - 1][i] = "#";
//                        field[line + 1][i] = "#";
//                    } else if (line == 0) {
//                        field[line + 1][i] = "#";
//                    } else {
//                        field[line - 1][i] = "#";
//                    }
//                } else if (field[line][i].equals(".")||field[line][i].equals("#")) {
//                    if (line == 0 && i == 0) {
//                        field[1][0] = "#";
//                        break;
//                    } else if (line == 0 && i != 0 && i != 9) {
//                        field[line + 1][i] = "#";
//                        field[line][i] = "#";
//                        field[line + 1][i+1] = "#";
//                        break;
//                    } else if (line == 0 && i == 9) {
//                        field[line + 1][i] = "#";
//                        field[line+1][i-1] = "#";
//                        field[line][i] = "#";
//                        break;
//                    } else if (line == 9 && i == 0) {
//                        field[8][0] = field[8][1] = field[9][1] = "#";
//                        break;
//                    } else if (line == 9 && i == 9) {
//                        field[8][9] = "#";
//                        field[8][8] = "#";
//                        field[9][8] = "#";
//                        break;
//                    } else if (line != 0 && i != 0) {
//                        field[line - 1][i] = "#";
//                        field[line + 1][i] = "#";
//                        field[line][i] = "#";
//                        break;
////                    }
//                }
//            }
//            for (int i = line; i <field[0].length; i++) {
//                if (field[i][column].equals("x")) {
//                    if (column != 0 && column != 9) {
//                        field[i][column-1] = "#";
//                        field[i][column+1] = "#";
//                    } else if (column == 0) {
//                        field[i][column+1] = "#";
//                    } else {
//                        field[i][column-1] = "#";
//                    }
//                } else if (field[i][column].equals(".")||field[i][column].equals("#")) {
//                    if (i == 0 && column == 0) {
//                        field[1][0] = "#";
//                        break;
//                    } else if (i == 0 && column != 0 && column != 9) {
//                        field[i+1][column] = "#";
////                        field[line][i] = "#";
////                        field[line + 1][i+1] = "#";
//                        break;
//                    } else if (i == 0 && column == 9) {
//                        field[i + 1][i] = "#";
////                        field[line+1][i-1] = "#";
////                        field[line][i] = "#";
//                        break;
//                    } else if (i == 9 && column == 0) {
//                        field[8][0] = "#";
//                        break;
//                    } else if (line == 9 && i == 9) {
//                        field[8][9] = "#";
////                        field[8][8] = "#";
////                        field[9][8] = "#";
//                        break;
//                    } else if (line != 0 && i != 0) {
////                        field[line - 1][i] = "#";
////                        field[line + 1][i] = "#";
//                        field[i][column] = "#";
//                        break;
//                    }
//                }
//            }
            for (int i = column; i < field.length; i++) {
                if (field[line][i].equals("#") || field[line][i].equals(".")) {
                    if (line == 0) {
                        field[line][i] = "#";
                        field[line + 1][i] = "#";
                        break;
                    } else if (line == 9) {
                        field[line][i] = "#";
                        field[line - 1][i] = "#";
                        break;
                    } else {
                        field[line + 1][i] = "#";
                        field[line][i] = "#";
                        field[line - 1][i] = "#";
                        break;
                    }
                }
            }
            for (int i = column; i >= 0; i--) {
                if (field[line][i].equals("#") || field[line][i].equals(".")) {
                    if (line == 0) {
                        field[line][i] = "#";
                        field[line + 1][i] = "#";
                        break;
                    } else if (line == 9) {
                        field[line][i] = "#";
                        field[line - 1][i] = "#";
                        break;
                    } else {
                        field[line + 1][i] = "#";
                        field[line][i] = "#";
                        field[line - 1][i] = "#";
                        break;
                    }
                }
            }
            for (int i = line; i < field[0].length; i++) {
                if (field[i][column].equals("#") || field[i][column].equals(".")) {
                    field[i][column] = "#";
                    break;
                }
            }
            for (int i = line; i >= 0; i--) {
                if (field[i][column].equals("#") || field[i][column].equals(".")) {
                    field[i][column] = "#";
                    break;
                }
            }
            for (int i = line; i < field.length; i++) {
                if (i != 0 && i != 9) {
                    if (field[i][column].equals("x") && !field[i + 1][column].equals("x") && !field[i - 1][column].equals("x")) {
                        field[i + 1][column] = "#";
                        field[i - 1][column] = "#";
                        break;
                    } else if (field[i][column].equals("x") && field[i + 1][column].equals("x")) {
                        field[i - 1][column] = "#";
                        break;
                    } else if (field[i][column].equals("x") && field[i - 1][column].equals("x")) {
                        field[i + 1][column] = "#";
                        break;
                    }
                } else if (i == 0) {
                    if (field[i][column].equals("x") && !field[i + 1][column].equals("x")) {
                        field[i + 1][column] = "#";
                        break;
                    } else {
                        if (field[i][column].equals("x") && !field[i - 1][column].equals("x")) {
                            field[i - 1][column] = "#";
                            break;
                        }
                    }
                }
            }
        }
        getField();
    }


    public static void main(String[] args) {
        SeaBoard seaBoard = new SeaBoard();
        for (int i = 0; i < seaBoard.field.length; i++) {
            Arrays.fill(seaBoard.field[i], ".");
        }
        seaBoard.getField();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            seaBoard.shoot(sc.nextInt(), sc.nextInt(), sc.next());
        }
    }
}
