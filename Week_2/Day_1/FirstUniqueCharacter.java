import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}



//Time Complexity O(n)
//Space Complexity O(n)




class OptimizedSolution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        int len = s.length();
        for(int i=0;i<len;i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<len;i++){
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}


//Time Complexity O(n)
//Space Complexity O(1)