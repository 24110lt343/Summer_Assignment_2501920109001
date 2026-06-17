class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums, int[] nums2) {
       HashMap<Integer,Integer> map = new HashMap<>();
       Stack<Integer> st = new Stack<>();
       for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
       }
       while(!st.isEmpty()){
        map.put(st.pop(),-1);
       }
       int res[] = new int[nums.length];
       for(int i=0;i<nums.length;i++){
            res[i] = map.get(nums[i]);
       }
       return res;
    }
}

//TimeComplexity : O(n);
//Space Complexity : O(n)