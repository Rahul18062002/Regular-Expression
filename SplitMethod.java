import java.util.regex.*;

public class SplitMethod {
    public static void main(String[] args) {
        // Split from space
        Pattern p = Pattern.compile("\\s");
        String[] s = p.split("Rahul Dinesh Patidar");
        for (String s1 : s) {
            System.out.println(s1);
        }

        // Split from [.] we can also write "\\."

        // Pattern p = Pattern.compile("[.]");
        // String[] s = p.split("source.unsplash.com");
        // for (String s1 : s) {
        // System.out.println(s1);
        // }

    }
}
