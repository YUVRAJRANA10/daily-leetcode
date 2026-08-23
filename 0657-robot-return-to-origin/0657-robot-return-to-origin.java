class Solution {
    public boolean judgeCircle(String moves) {
int x = 0;
        int y = 0;
        
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U': 
                    y++; 
                    break;
                case 'D': 
                    y--; 
                    break;
                case 'L': 
                    x--; 
                    break;
                case 'R': 
                    x++; 
                    break;
            }
        }
        
        // If both x and y are 0, the robot is back at the origin
        return x == 0 && y == 0;
    }
}