import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("aaa", "b", "cd");
        Collections.sort(s, new LengthComparator());
        System.out.println(s); // Should print [b, cd, aaa]
    }
}
