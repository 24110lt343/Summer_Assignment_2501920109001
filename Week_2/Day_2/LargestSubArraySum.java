class OptimalSolution {
    public int maxSubArray(int[] nums) {
      int max = Integer.MIN_VALUE;
      int j = 0;
      int temp = 0;
      while(j<nums.length){
        if(temp + nums[j] < 0 ) {
            temp+=nums[j];
            max = Math.max(temp,max);
            temp = 0;
        }else{
            temp+=nums[j];
            max = Math.max(temp,max);
        }
        j++;
      }
      return max;
    }
}

// TimeComplexity O(n)
//Space Complexity O(1);