class OptimalSolution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double maxAvg = Integer.MIN_VALUE,tempSum = 0;
        for(j=0;j<k;j++){
            tempSum+=nums[j];
        }
        maxAvg = Math.max(maxAvg,tempSum/k);
        while(j<nums.length){
                tempSum+=nums[j++];
                tempSum-=nums[i++];
                maxAvg = Math.max(maxAvg,tempSum/k);
            
        }
        return maxAvg;
    }
}


// Time Complexity O(n)
// Space complexity O(1)