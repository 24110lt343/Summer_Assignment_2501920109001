import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Stack<Character> st = new Stack<>();
        char arr[] = strs[0].toCharArray();
        for(char ch : arr) st.push(ch);
        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];

            while (st.size() > curr.length()) {
                st.pop();
            }

            while (!st.isEmpty()) {
                boolean match = true;

                for (int j = 0; j < st.size(); j++) {
                    if (curr.charAt(j) != strs[0].charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) break;

                st.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }

        return result.toString();

    }
}

//Time complexity O(n × m²)
//Space complexity O(m)