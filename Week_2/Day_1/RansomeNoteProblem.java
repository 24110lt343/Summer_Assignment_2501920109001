class Solution {
    public boolean canConstruct(String rn, String mz) {
        int maz[] = new int[26];
        int rnx[] = new int[26];
        for(int i=0;i<mz.length();i++) maz[mz.charAt(i) - 'a']++;
        for(int i=0;i<rn.length();i++) rnx[rn.charAt(i) - 'a']++;
        for(int i=0;i<rn.length();i++){
            if(maz[rn.charAt(i) - 'a']<rnx[rn.charAt(i) - 'a']) return false;
        }
        return true;
    }
}

//Time Complexity O(n)
//Space Complexity O(1)