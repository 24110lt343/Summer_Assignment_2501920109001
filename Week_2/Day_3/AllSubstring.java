class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String sum = s+s;
        return sum.substring(1,sum.length() - 1).contains(s);
    }
}
//Time Complexity O(n)
//Space complexity O(1)