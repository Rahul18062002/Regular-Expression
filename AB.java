import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AB {
    public static void main(String[] args) {

        int count = 0;
        Pattern p = Pattern.compile("ab"); // Pattern / RE
        Matcher m = p.matcher("ababaaba"); // Target String

        while (m.find()) {
            count++;
            System.out.println(m.start() + "--" + m.end() + "--" + m.group());
        }
        System.out.println("The number of Occurence " + count);
    }
}