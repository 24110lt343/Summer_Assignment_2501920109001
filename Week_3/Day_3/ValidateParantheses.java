class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>();
        if(s.length()%2!=0) return false;
        if(c.size() == 0 && s.charAt(0) == ')' || s.charAt(0) == '}' ||s.charAt(0) == ']') return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(' ) c.push(ch);
            if(ch == '}' || ch == ']' || ch == ')' ){
                if(c.size() != 0 && ch == '}' && c.peek() == '{' ) c.pop();
                else if(c.size() != 0 &&  ch == ']' && c.peek() == '['  ) c.pop();
                else if( c.size() != 0 && ch == ')' && c.peek() == '(') c.pop();
                else return false;
            }
            
        }
        
        return c.size() == 0?true:false;
    }
}


//Time Complexity : O(n)
//Space Complexity: O(n)