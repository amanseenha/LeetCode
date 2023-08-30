//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return 0; // No jumps needed for an empty array or a single element array
        }
        if (arr[0] == 0) {
            return -1; // Cannot start from a position with jump distance 0
        }
        int jumps = 1; // Starting jump from the first position
        int maxReach = arr[0]; // Maximum index reachable from the current position
        int steps = arr[0]; // Steps remaining at the current jump
        for (int i = 1; i < len; i++) {
            if (i == len - 1) {
                return jumps; // Reached the end
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1; // Cannot move forward anymore
                }
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
