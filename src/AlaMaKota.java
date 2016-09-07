import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlaMaKota {

    public static void main(String[] args) {

        String text = "ala ma kota i kot ma ale aLe KoTa nie widziano.";

        Pattern pattern = Pattern.compile("(?i)kot|ala");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start()+ " " + matcher.group() + " " + matcher.end());
        }
    }
}
