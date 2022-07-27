import java.util.Scanner;
public class Guess_Number {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("�������� ������� ����� �� 0 �� 100!");
        double random = (int) 100*Math.random();
        int guessed = (int) random;
        int decision = sc.nextInt();
        while (!checkCoincidence(decision, guessed)) {
            if (decision > guessed) {
                decision = sc.nextInt();
            } else if (decision < guessed) {
                decision = sc.nextInt();
            }
        }
        if(decision==guessed){
            System.out.println("���, ���, � �� �������!!!");
        }
    }
    public static boolean checkCoincidence(int my, double guessed){
        boolean result = true;
        if(my==guessed){
            return result;
        }else if(my<guessed){
            System.out.println("����� ������ ���� ������!");
            result=false;
        }else if ((my>guessed)){
            System.out.println("����� ������ ���� ������!");
            result=false;
        }
        return result;
    }
}
