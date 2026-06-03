class OptimalSolution {
    public int maxArea(int[] height) {
        int mostWater = 0;
        int i=0,j=height.length-1;
        while(i<j){
            int minx = Math.min(height[i],height[j]);
            mostWater = Math.max(mostWater,minx * (j-i));
            if(height[i] == minx) i++;
            else j--;
        }
        return mostWater;
    }
}

//Time complexity O(n);
// Space complexity o(1)