package Week_2.Day_2;
import java.util.*;
class Solution {

    public int[] countFreq(String s){
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++) arr[s.charAt(i) - 'a']++;
        return arr;
    }

    public boolean isSatisfied(int arr[]){
        for(int x:arr){
            if(x!=0) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int i=0,j =0;
        if (p.length() > s.length()) {
            return result;
        }
        int check[] = countFreq(p);

        while(j<p.length()){
            check[s.charAt(j) - 'a']--;
            j++;
        }

        if(isSatisfied(check)) result.add(0);

        while(j<s.length()){
            check[s.charAt(i) - 'a']++;
            i++;
            check[s.charAt(j) - 'a']--;
            j++;
            if(isSatisfied(check)) result.add(i);
        }

        return result;
    }
}



// Time Complexity O(n)
