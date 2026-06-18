class Solution {
    public int[] dailyTemperatures(int[] t) {
        int len = t.length;
        int ans[] = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int prevIdx = st.pop();
                ans[prevIdx] = i - prevIdx;
            }
            st.push(i);
        }

        return ans;
    }

}

//Time Complexity O(n)
//Space Complexity O(n)