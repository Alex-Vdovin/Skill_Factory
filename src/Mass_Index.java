import java.util.Scanner;
public class Mass_Index {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор индекса массы тела. \nВведите свой рост в сантиметрах");
        double height = getDimension();
        System.out.println("Введите свой вес в кг");
        double weight = getDimension();
        sc.close();
        double mass_Index = weight/(Math.pow(height/100, 2));
        if(mass_Index<18.5){
            System.out.println("Ваш индекс массы тела: "+String.format("%.1f", mass_Index) +" У Вас пониженный вес. Вам нужно лучше питаться.");
        }else if(mass_Index>=18.5&&mass_Index<25){
            System.out.println("Ваш индекс массы тела: "+String.format("%.1f", mass_Index) +" Нормальная масса тела, нет оснований для беспокойства");
        } else if (mass_Index>=25&&mass_Index<30) {
            System.out.println("Ваш индекс массы тела: "+String.format("%.1f", mass_Index) +" Избыточный вес и риск развития атеросклероза, сахарного диабета и других заболеваний");
        } else if (mass_Index>=30&&mass_Index<40) {
            System.out.println("Ваш индекс массы тела: "+String.format("%.1f", mass_Index) +" Выраженный избыточный вес (ожирение), увеличивается риск для здоровья");
        } else if (mass_Index>=40) {
            System.out.println("Ваш индекс массы тела: "+String.format("%.1f", mass_Index) +" Резко выраженный избыточный вес (сверхтучность). Риск для здоровья очень высокий.");
        }

        }
    public static double getDimension(){
        double dimension = 0;
        if(sc.hasNextDouble()) {
            dimension = sc.nextDouble();
        }else{
            System.out.println("Введите число!");
            sc.next();
            dimension = getDimension();
        }
        return dimension;
    }

}

