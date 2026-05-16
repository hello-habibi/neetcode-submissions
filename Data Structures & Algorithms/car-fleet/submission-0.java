class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;
        
        // Use an array where the INDEX is the car's starting position.
        // This implicitly sorts the cars by position.
        double[] timeArr = new double[target + 1];

        // Calculate the time it takes for each car to reach the target
        for(int i = 0; i < n; i++){
            // Cast to double to prevent integer division truncation
            timeArr[position[i]] = (double)(target - position[i]) / speed[i];
        }

        int fleets = 0;
        double slowestTimeAhead = 0.0;

        // Iterate backwards: from the car closest to the target down to position 0
        for(int i = target; i >= 0; i--){
            if(timeArr[i] > 0){ // If there is a car at this position
                // If this car's time is strictly greater than the fleet ahead of it,
                // it cannot catch up, so it forms a brand new fleet.
                if(timeArr[i] > slowestTimeAhead){
                    slowestTimeAhead = timeArr[i];
                    fleets++;
                }
            }
        }
        
        return fleets;
    }
}