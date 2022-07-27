import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {

    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами Charlie has charming smile";
        Pattern pattern = Pattern.compile("\\b[СсCc]\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

}