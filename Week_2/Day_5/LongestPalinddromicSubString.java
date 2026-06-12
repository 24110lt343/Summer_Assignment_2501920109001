class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        // int i=0,j=0;
        int maxSubStr = 0;
        String result = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                    if(s.charAt(j) == s.charAt(i)){
                        StringBuilder sb = new StringBuilder();
                        String sbstr = s.substring(i,j+1);
                        sb.append(sbstr);
                        if(String.valueOf(sb.reverse()).equals(sbstr) && sbstr.length()>maxSubStr){
                                result = sbstr;
                                maxSubStr = sbstr.length();
                        }
                    }
            }
        }

        
        return result;
    }
}

// Time Complexity O(n^3)