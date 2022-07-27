
public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder stringBuffer = new java.lang.StringBuilder();
        long startTime = System.currentTimeMillis();
        stringBuffer.append("yfbvohsbhvfsbohsbvofsbs");
        stringBuffer.deleteCharAt(0);
        stringBuffer.append(" YOU MY HEART");
        stringBuffer.setCharAt(0,'L');
        stringBuffer.insert(1,"OVE THE WAY YOU LIES ");
        stringBuffer.reverse();
        String result = stringBuffer.toString();
        System.out.println(result);
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
