/*
 * a --> Exactly One 'a'
 * a+ --> Atleast One 'a'
 * a* --> Any Number of a's including Zero Number Also
 * a? --> Atmost One  'a'
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        String reg = "a*";
        String target = "abaabaaab";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(target);

        while (m.find()) {
            System.out.println(m.start() + "--" + m.group());
        }
    }
}
