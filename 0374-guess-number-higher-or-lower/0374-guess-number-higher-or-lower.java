/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long s=1, e=n;
        long m=(s+e)/2;
        while(guess((int)m)!=0){
            if(guess((int)m)==-1){
                e=m-1;
            }
            else if(guess((int)m)==1){
                s=m+1;
            }
            m=(s+e)/2;
        }
        return (int)m;
    }
}