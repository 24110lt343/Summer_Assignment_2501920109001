class BruteForceSolution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i] == 0){
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        i++;
                        j = i+1;
                        break;
                    }
                    j++;
                }
            }else{
                i++;
                j=i+1;
            }
        }
    }
}

// Time Complexity O(n^2)
// Space complexity O(n)




class OptimalSolutionWithTooMuchConditions {
    public void moveZeroes(int[] nums) {
        int i=0,j=1; boolean flag = false;
        while(j<nums.length){
            if(nums[i] != 0 && flag == false){
                i++;
                j = i+1;
            }else if(nums[i] == 0 && nums[j] == 0 && flag == false){
                j++;
                flag = true;
            }else if(nums[i] == 0 && nums[j] !=0 && flag == true){
                nums[i++] = nums[j];
                nums[j] = 0;
                flag = false;
                j++;
            }else if(nums[i] == 0 && nums[j] != 0 && flag == false){
                nums[i++] = nums[j];
                nums[j] = 0;
                j++;
            }else if(nums[i] == 0 && nums[j] == 0 && flag == true){
                j++;
            }
        }
    }
}

//Time Complexity O(n)
// Space Complexity O(1)



class OptimalSimple {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[count++] = nums[i];
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}


// Time Complexity O(n)
// Space Complexity O(1)


