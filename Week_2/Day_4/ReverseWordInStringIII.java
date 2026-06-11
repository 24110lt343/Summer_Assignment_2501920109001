class BruteForce {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){ 
                for(int x=i-1;x>=j;x--) sb.append(String.valueOf(s.charAt(x))); 
                sb.append(" ");
                j = i+1; 
            }
            else if(i == s.length()-1){ 
                for(int x=i;x>=j;x--) sb.append(String.valueOf(s.charAt(x)));
                j = i+1;
            }
       }

       return sb.toString();

    }
}

//TIme complexity O(n*m)


class OptimalSolution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");
        for(String word:arr){
            StringBuilder temp = new StringBuilder();
            temp.append(word).reverse();
            sb.append(temp).append(" ");
        }

       return sb.toString().substring(0,s.length());

    }
}

//Time Complexity O(n)