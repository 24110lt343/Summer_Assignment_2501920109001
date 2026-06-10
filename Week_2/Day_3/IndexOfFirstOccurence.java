class Solution {
    
    public int strStr(String hs, String ndl) {
        int lenh = hs.length();
        int lenn = ndl.length();
        int i=0;
         if (lenn == 0) return 0;
        while(i<=lenh - lenn){
            int copy = i;
            int temp = 0;
            if(ndl.charAt(temp) == hs.charAt(i)){
                boolean isValid = true;
                while(temp<lenn){
                    if(ndl.charAt(temp) != hs.charAt(copy+temp)){
                        isValid = false;
                        break;
                    }
                    temp++;
                }
                if(temp==lenn && isValid == true) return copy;
            }
            i++;
        }  

        return -1; 

    }
}

//Time Complexity O(n*m)