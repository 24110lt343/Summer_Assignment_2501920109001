class BruteForceSolution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]) profit = Math.max(profit,prices[j] - prices[i]);
            }
        }
        return profit;
    }
}

class OptimalSolution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            else{
                profit = Math.max(profit,prices[i] - min);
            }
        }
        return profit;
    }
}
