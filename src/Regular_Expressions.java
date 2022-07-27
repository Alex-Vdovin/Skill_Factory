import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})");
        for(int aCount=1000000;aCount<9999999;aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if(matcher.find()){
                stringBuffer.append("+7(926)"+matcher.group(1)+"-"+matcher.group(2)+";");
            }
        }
        pattern = Pattern.compile("(\\d0{2})-(0{4})");
        Matcher matcher2 = pattern.matcher(stringBuffer);
        while (matcher2.find()){
            System.out.println("+7(926)"+matcher2.group(1)+"-"+matcher2.group(2)+";");
        }
    }
}

