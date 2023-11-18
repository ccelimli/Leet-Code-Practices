import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String word = "uuuuuu";
        System.out.println(countPalindromicSubsequence(word));
    }

    public static int countPalindromicSubsequence(String s) {
        int[][] startEnd = new int[26][2];
        for (int i = 0; i < 26; i++)
            Arrays.fill(startEnd[i], -1);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (startEnd[index][0] < 0)
                startEnd[index][0] = i;
            startEnd[index][1] = i;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            int start = startEnd[i][0], end = startEnd[i][1];
            Set<Character> set = new HashSet<Character>();
            for (int j = start + 1; j < end; j++)
                set.add(s.charAt(j));
            count += set.size();
        }
        return count;
    }
}
