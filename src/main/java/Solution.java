class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) return false;

        double logBase4 = Math.log(n) / Math.log(4);
        return logBase4 == Math.floor(logBase4); //checks if integer
    }
}