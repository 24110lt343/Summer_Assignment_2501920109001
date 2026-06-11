class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(result,n,0,0,"");
        return result;
    }

    public void solve(List<String> result, int n,int open,int close,String curr){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
        }

        if(open<n){
            solve(result,n,open+1,close,curr+"(");
        }

        if(close < open){
            solve(result,n,open,close+1,curr+")");
        }
    }
}

//Time complexity + Space Complexity O(Cₙ × n)