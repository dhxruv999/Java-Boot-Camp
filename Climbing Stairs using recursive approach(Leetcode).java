class Solution {
    public int climbStairs(int n) {
        //base condition
        if (n<2){
            return 1;
        }
        
        //logic 
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
