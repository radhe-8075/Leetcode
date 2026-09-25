import java.util.*;

class Solution {
    String s;
    int i = 0;

    public List<String> braceExpansionII(String expression) {
        s = expression;
        Set<String> set = solve();
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }

    Set<String> solve() {
        Set<String> ans = new HashSet<>();
        Set<String> cur = new HashSet<>();
        cur.add("");

        while (i < s.length() && s.charAt(i) != '}') {

            if (s.charAt(i) == ',') {
                ans.addAll(cur);
                cur.clear();
                cur.add("");
                i++;
            }

            else if (s.charAt(i) == '{') {
                i++;
                cur = join(cur, solve());
                i++;
            }

            else {
                String x = "";
                while (i < s.length() && s.charAt(i) >= 'a'
                        && s.charAt(i) <= 'z') {
                    x += s.charAt(i++);
                }

                Set<String> temp = new HashSet<>();
                temp.add(x);
                cur = join(cur, temp);
            }
        }

        ans.addAll(cur);
        return ans;
    }

    Set<String> join(Set<String> a, Set<String> b) {
        Set<String> res = new HashSet<>();

        for (String x : a)
            for (String y : b)
                res.add(x + y);

        return res;
    }
}