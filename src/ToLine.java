import java.util.Arrays;

public class ToLine {
    private int[][] data;
    public ToLine(int[][]data){
        this.data = data;
    }
    public int[] resize(){
        int[] array = new int[data.length*data[0].length];
        int count = 0;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                array[count] = data[i][j];
                count++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        System.out.println(Arrays.toString(arr));
    }
}
