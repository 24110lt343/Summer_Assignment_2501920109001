import java.util.*;;
class SimpleSolution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}


// Time Complexity O(n)
// Space Complexity(1)