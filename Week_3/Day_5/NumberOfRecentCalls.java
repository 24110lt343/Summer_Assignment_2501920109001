class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        int range = t - 3000;
        q.offer(t);
        List<Integer> list = new ArrayList<>(q);
        int timeInPast = 0;
        int count = 0;
        if(range < 0) return list.size();
        for(int i = list.size()-1; i>=0;i--){
            if(range <= list.get(i)) count++;
            else break;
        }
        return count;
    }
}

// Time complexity : O(n)
// Space Complexity : o(n)



class OptimalSolution {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        int LOOKBACK = 3000;
        while(!q.isEmpty() && q.peek() < t - LOOKBACK){
            q.poll();
        }
        q.add(t);
        return q.size();
    }
}

//Space Complexity  : O(n);
// Time complexity : O(n)