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
        // code here
        int[] ans = new int[2];
        long len = (long)n;
        long S = 0, S2 = 0;
        long SN = (len*(len+1))/2;
        long S2N = (len*(len+1)*(2*len+1))/6;
        for(int i=0; i<len; i++){
            S += arr[i];
            S2 += (long)arr[i]*arr[i];
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2/val1;
        long B = (val1+val2)/2;
        long A = B-val1;
        ans[0] = (int)B;
        ans[1] = (int)A;
        return ans;
    }
}