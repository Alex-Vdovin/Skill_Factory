import java.util.Arrays;

public class Separator {
    private int[] array;
    private int[] arrayEven;
    private int[] arrayOdd;
    private int count;
    public Separator(int[]array){
        this.array = array;
    }
    public int[] even(){

        for(int s:array){
            if(s%2==0){
              count++;
            }
        }
        arrayEven = new int[count];
        count=0;
        for(int s: array) {
            if (s % 2 == 0) {
                arrayEven[count] = s;
                count++;
            }
        }
        count = 0;
        return arrayEven;
    }
    public int[] odd(){
        for(int s:array){
            if(s%2!=0){
                count++;
            }
        }
        arrayOdd = new int[count];
        count = 0;
        for(int s: array) {
            if (s % 2 != 0) {
                arrayOdd[count] = s;
                count++;
            }
        }
        count = 0;
        return arrayOdd;
    }
    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{2, 4,6,7,34,646,});
        System.out.println(Arrays.toString(separator.odd()));
        System.out.println(Arrays.toString( separator.even()));
    }
}
