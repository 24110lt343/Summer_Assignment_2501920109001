class Solution {
    public int[] freqCounter(String s){
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++) arr[s.charAt(i) - 'a']++;
        return arr;
    }

    public boolean isMatching(String s,int arr[]){
        int cloned[] = arr.clone();
        for(int i=0;i<s.length();i++){
            if(cloned[s.charAt(i) - 'a'] <= 0) return false;
            else cloned[s.charAt(i) - 'a']--;
        }

        for (int count : cloned) {
        if (count != 0)
            return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        List<String> traced = new ArrayList<>();
        if(strs.length == 0){
            temp.add("");
            result.add(temp);
            return result;
        }

        int check[];

        for(int i=0;i<strs.length;i++){
            if(traced.contains(strs[i])) continue;
            check = freqCounter(strs[i]);
            traced.add(strs[i]);
            temp.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(isMatching(strs[j],check)){
                    temp.add(strs[j]);
                    traced.add(strs[j]);
                }
            }
            result.add(new ArrayList<>(temp));
            temp.clear();
        }

        return result;

    }
}

// Time Complexity: O(n² × k)