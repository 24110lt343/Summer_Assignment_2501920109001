import java.util.*;

class BruteForceSolution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target) return new int[]{i,j};
            }
       }
       return new int[]{};
    }
}


class OptimizedSolutionUsingHashmap {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(target - nums[i])) return new int[]{i,map.get(target -nums[i])};
        else map.put(nums[i],i);
       }
       return new int[]{};
    }
}

public class TwoSum{
    public static void main(String[] args) {

        // BruteForceSolution bfs = new BruteForceSolution();
        OptimizedSolutionUsingHashmap osuh = new OptimizedSolutionUsingHashmap();

        int arr[] = {2,7,11,15}, target = 9;

        // int result[] = bfs.twoSum(arr, target);
        int result[] = osuh.twoSum(arr, target);

        for(int i:result){

            System.out.print(i+" ");

        }

    }
}