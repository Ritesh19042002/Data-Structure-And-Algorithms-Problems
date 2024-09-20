package String; // Correct the package name to match your directory structure
import java.util.*;
public class LargestSubstringBtwTwoCharacter {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] d = new int[26];
        Arrays.fill(d, -1);
        int ans = -1;
        for (int i = 0; i < s.length(); ++i) {
            int j = s.charAt(i) - 'a';
            if (d[j] == -1) {
                d[j] = i;
            } else {
                ans = Math.max(ans, i - d[j] - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LargestSubstringBtwTwoCharacter solution = new LargestSubstringBtwTwoCharacter();

        System.out.println(solution.maxLengthBetweenEqualCharacters("aa"));    // Output: 0
        System.out.println(solution.maxLengthBetweenEqualCharacters("abca"));  // Output: 2
        System.out.println(solution.maxLengthBetweenEqualCharacters("cbzxy")); // Output: -1
    }
}
