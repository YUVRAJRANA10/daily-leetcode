class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;   // Tracks gas for the ENTIRE trip
        int currentTank = 0; // Tracks gas for your CURRENT attempt
        int startIndex = 0;  // Where we are guessing the trip should start

        for (int i = 0; i < gas.length; i++) {
            int netGas = gas[i] - cost[i]; // Gas gained/lost at this specific station
            
            totalTank += netGas;   // Add to our global tracker
            currentTank += netGas; // Add to our current road trip tracker

            // Did we just run out of gas? 
            if (currentTank < 0) {
                // The Golden Rule: Everything from startIndex to i is a failure.
                // So, we guess the next station (i + 1) is the correct start.
                startIndex = i + 1;
                
                // We reset our current tank to 0 because we are starting a fresh trip
                currentTank = 0;
            }
        }

        // After checking all stations, is the whole trip actually possible?
        if (totalTank >= 0) {
            return startIndex; // Yes! Our last guessed start index is the right one.
        } else {
            return -1; // No, we don't have enough gas globally.
        }
    }
}