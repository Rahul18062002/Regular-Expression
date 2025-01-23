import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {
        
        String reg = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";

        String target = "rahulpatidar25016@gmail.com";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(target);

        if (m.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

/*
 * 1) To represent any main id
 * [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
 * 
 * 
 * 2) To reprresent only Gmail id
 * [a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com
 */