import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {


    public static void main(String[] args) {
        String text = "255.255.255.255  1.1.1.1 346.500.700.288 SW Eltex MES1124 �� ���-66 388-22-66-��� �1 MES-1124 (172.16.16.93):03 /nSW D-Link DES-1210-28/ME �� ���-45 ���� DES-1210-28 (172.16.252.170) /nSW D-Link DES-1210-28/ME 385-4 ����� ���-32/2 32/2-106/5(���) DES-1210-28(���) (10.50.140.206):02 /n��� 2036 35 (1) ��� ���2036-001 d2036-3(10.54.20.124) 0/0";
        Pattern pattern = Pattern.compile("\\b((([01]?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))\\.){3}(([01]?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
