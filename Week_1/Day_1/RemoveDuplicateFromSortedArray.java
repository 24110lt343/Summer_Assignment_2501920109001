class BruteForceSolution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                while(j<nums.length && nums[i] == nums[j]) j++;
                if(j<nums.length){
                    nums[++i] = nums[j];
                }else {
                    break;
                }
            }else{
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

class OptimizedSolution {
    public int removeDuplicates(int[] nums) {
        int i= 0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
