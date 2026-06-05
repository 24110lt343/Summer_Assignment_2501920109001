class OptimalCleaner {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!Character.isLetterOrDigit(left)) i++;
            else if(!Character.isLetterOrDigit(right)) j--;
            else if(left != right) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}


class RoughSolution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         String finalx = "";
        for(char x:s.toCharArray()){
            if(x >= 'a' && x<= 'z' || x>= 'A' && x <= 'Z' || x >= '0' && x<= '9') finalx+=String.valueOf(x).toLowerCase();
        }
        int i=0,j=finalx.length()-1;
        while(i<j){
            if(finalx.charAt(i) != finalx.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

