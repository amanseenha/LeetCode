//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int[] hash = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr){
            hash[i] += 1;
        }
        for(int i=0; i<n; i++){
            if(hash[i] > 1){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
            return list;
        }
        return list;
    }
}
