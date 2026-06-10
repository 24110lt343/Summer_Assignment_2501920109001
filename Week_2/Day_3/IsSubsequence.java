class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length() == 0) return true;
        int temp = 0;
        for(int i =0;i<t.length();i++){
            if(temp>=s.length()) break;
            if(t.charAt(i) == s.charAt(temp)) temp++;
        }
        if(temp == s.length()) return true;

        return false;
    }
}


//TimeComplexity O(n);
//SpaceComplexity O(1)