import java.util.Arrays;

public class ToTable {
    private int[] data;
    private int x;
    private int y;
    private int[][] array;

    public ToTable(int[]data, int x, int y){
        this.x = x;
        this.y = y;
        this.array = new int[x][y];
        this.data = data;
        System.out.println(Arrays.toString(data));
    }
    public int[][] resize(){
        int count = 0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                array[i][j] = data[count];
                ++count;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        ToTable data = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] array = data.resize();
        System.out.println(Arrays.deepToString(array));
    }
}
