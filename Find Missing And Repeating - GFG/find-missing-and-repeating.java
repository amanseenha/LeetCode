//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        long actualSum = 0, actualSquareSum = 0;
        for(int i: arr){
            actualSum += i;
            actualSquareSum += (long)i * i;
        }
        long sum = (long)n * (n + 1) / 2;
        long squareSum = (long)n * (n + 1) * (2 * n + 1) / 6;
        long val1 = actualSum - sum;
        long val2 = actualSquareSum - squareSum;
        long A = (val2 - val1 * val1) / (2 * val1);
        long B = A + val1;
        ans[0] = (int)B;
        ans[1] = (int)A;
        return ans;
    }
}
