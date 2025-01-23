/*
 * \s --> Space Character
 * \S --> Except Spacer character
 * \d --> Any digit from 0 to 9
 * \D --> Except digit from 0 to 9
 * \w --> Any Alphanumeric character
 * \W --> Except Alphanumeric character i.e. Special Character
 * . -->  Any Character
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        String reg = "\\s";
        String target = "a7b@ Z#9";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(target);

        while (m.find()) {
            System.out.println(m.start() + "--" + m.group());
        }
    }
}
