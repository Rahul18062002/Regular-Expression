import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mobile Number : ");
        String mo = sc.nextLine();

        String reg = "(0|91|\\+91)?[6-9][0-9]{9}";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(mo.trim());
        if (m.matches()) {
            System.out.println("Success!");
        } else {
            System.out.println("Please Enter a valid Mobile Number !!");
        }
        sc.close();
    }
}

/*
 * 1) 10 digit and start with 6,7,8 or 9
 * ==> [6-9][0-9]{9}
 * 
 * 2) 10 or 11 Digit possible if 11 digit then first digit should be 0
 * ==> 0?[6-9][0-9]{9}
 * 
 * 3) 10 only , 11 if starts with 0 , 12 if start with 91
 * ==> (0|91)?[6-9][0-9]{9}
 */
