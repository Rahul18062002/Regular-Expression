/*
 * [abc] --> Either a or b or c
 * [^abc] --> Except a , b and c
 * [a-z] --> Any lowercase alphabet symbol
 * [A-Z] --> Any Uppercase alphabet symbol
 * [a-zA-Z] --> Any alphabet
 * [0-9] --> Any digit from 0 to 9
 * [a-zA-Z0-9] --> Any Alphanumeric character
 * [^a-zA-Z0-9] --> Except Alphanumeric character
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String reg = "[^a-zA-Z9#]";
        String target = "a7b@Z#9";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(target);

        while (m.find()) {
            System.out.println(m.start() + "--" + m.group());
        }
    }
}
