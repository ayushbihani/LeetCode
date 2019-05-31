/**
 * Guess Number Higher or Lower
 * @link https://leetcode.com/problems/guess-number-higher-or-lower/
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = 1;
        while(low<=high){
            mid = low+(high-low)/2;
            int g = guess(mid);
            if(g==0)
                return mid;
            else if(g==-1){
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return mid;
    }
}