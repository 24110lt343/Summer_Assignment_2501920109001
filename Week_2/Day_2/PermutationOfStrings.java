class OptimalSolution {

    public int[] getFreq(String s1){
        int arr[] = new int[26];
        for(int i = 0;i<s1.length();i++) arr[s1.charAt(i) - 'a']++;
        return arr;
    }

    public boolean isSatisfied(int arr[]){
        for(int x:arr){
            if(x!=0) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int i=0,j=0;
        int lens1 = s1.length();
        int lens2 = s2.length();
        if(lens2<lens1) return false;
        int check[] = getFreq(s1);
        while(j<lens1){
            check[s2.charAt(j) - 'a']--;
            j++;
        }
        if(isSatisfied(check)) return true;

        while(j<lens2){
            check[s2.charAt(i) - 'a']++;
            i++;
            check[s2.charAt(j) - 'a']--;
            j++;
            if(isSatisfied(check)) return true;
        }

        return false;
    }
}


//Time Complexity  O(n);
//Space Complexity O(1)