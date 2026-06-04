class BruteForce {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) sum+=mat[i][j];
            }
            sum+=mat[i][n-i-1];
        }
        if(n%2==0) return sum;
        sum-=mat[n/2][n/2];
        return sum;
    }
}


//Time complexity O(n^2)
//Space complexity O(1);


class OptimalSolution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-1-i];
        }
        if(n%2==0) return sum;
        sum-=mat[n/2][n/2];
        return sum;
    }
}


//Time complexity O(n)
//Space complexity O(1);

