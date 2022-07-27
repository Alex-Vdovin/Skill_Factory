import java.util.Scanner;
public class Mass_Index {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("����� ���������� � ����������� ������� ����� ����. \n������� ���� ���� � �����������");
        double height = getDimension();
        System.out.println("������� ���� ��� � ��");
        double weight = getDimension();
        sc.close();
        double mass_Index = weight/(Math.pow(height/100, 2));
        if(mass_Index<18.5){
            System.out.println("��� ������ ����� ����: "+String.format("%.1f", mass_Index) +" � ��� ���������� ���. ��� ����� ����� ��������.");
        }else if(mass_Index>=18.5&&mass_Index<25){
            System.out.println("��� ������ ����� ����: "+String.format("%.1f", mass_Index) +" ���������� ����� ����, ��� ��������� ��� ������������");
        } else if (mass_Index>=25&&mass_Index<30) {
            System.out.println("��� ������ ����� ����: "+String.format("%.1f", mass_Index) +" ���������� ��� � ���� �������� �������������, ��������� ������� � ������ �����������");
        } else if (mass_Index>=30&&mass_Index<40) {
            System.out.println("��� ������ ����� ����: "+String.format("%.1f", mass_Index) +" ���������� ���������� ��� (��������), ������������� ���� ��� ��������");
        } else if (mass_Index>=40) {
            System.out.println("��� ������ ����� ����: "+String.format("%.1f", mass_Index) +" ����� ���������� ���������� ��� (�������������). ���� ��� �������� ����� �������.");
        }

        }
    public static double getDimension(){
        double dimension = 0;
        if(sc.hasNextDouble()) {
            dimension = sc.nextDouble();
        }else{
            System.out.println("������� �����!");
            sc.next();
            dimension = getDimension();
        }
        return dimension;
    }

}

