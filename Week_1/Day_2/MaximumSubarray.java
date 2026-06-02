class BruteForceSolution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                maxi = Math.max(maxi,temp);
            }
            temp = 0;
        }
        return maxi;
    }
}

class OptimalSolution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int j=0;
        int temp = 0;
       
        while(j<nums.length){
            if(temp + nums[j] < 0){
                maxi = Math.max(maxi,temp+nums[j]);
                temp = 0;
            }else{
                temp+=nums[j];
                maxi = Math.max(maxi,temp);
            }
              j++;
        }
        return maxi;
    }
}



// Optimal Soultion using kadane's Algorithm

