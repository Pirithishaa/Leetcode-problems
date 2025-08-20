import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        int n = s.length;
        boolean[] a = new boolean[n];
        List<List<String>> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!a[i]) {
                a[i] = true;
                List<String> g = new ArrayList<>();
                g.add(s[i]);

                for (int j = i + 1; j < n; j++) {
                    if (!a[j] && anagram(s[i], s[j])) {
                        a[j] = true;
                        g.add(s[j]);
                    }
                }

                l.add(g);
            }
        }

        return l;
    }

    public boolean anagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
