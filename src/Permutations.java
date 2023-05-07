import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> permutation(String s) {
        List<String> perms = new ArrayList<>();
        if (s.length() == 1) {
            perms.add(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                String rest = s.substring(0, i) + s.substring(i + 1);
                for (String p : permutation(rest)) {
                    perms.add(c + p);
                }
            }
        }
        return perms;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> perms = permutation(s);
        for (String p : perms) {
            System.out.println(p);
        }
    }
}