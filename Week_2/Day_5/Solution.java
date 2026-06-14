class Solution {
    public int compress(char[] chars) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        int charLen = chars.length;
        char prev = ' ';

        for (int i = 0; i < charLen; i++) {
            char chx = chars[i];

            if (i == 0) {
                prev = chx;
                count++;
            } else if (chx == prev) {
                count++;
            } else {
                result.append(prev);
                if (count > 1) result.append(count);

                prev = chx;
                count = 1;
            }
        }

        result.append(prev);
        if (count > 1) result.append(count);

        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}

//Time Complexity : O(n)