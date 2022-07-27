
public class Rectangular {
    private final int s, w, h;
    public Rectangular(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
    boolean checker(){
        return getW() * getH() == getS();
    }

    public static void main(String[] args) {
        Rectangular rect = new Rectangular(10, 10);
        System.out.println(rect.getS());
        System.out.println(rect.getW());
        System.out.println(rect.getH());
        System.out.println(rect.checker());
    }
}
