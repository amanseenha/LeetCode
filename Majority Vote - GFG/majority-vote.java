//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        // code here
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        int count1 = 0, count2=0;
        for(int i=0; i<n; i++){
            if(count1==0 && candidate2!=nums[i]){
                count1=1;
                candidate1 = nums[i];
            }
            else if(count2==0 && candidate1!=nums[i]){
                count2=1;
                candidate2 = nums[i];
            }
            else if(nums[i]==candidate1) count1++;
            else if(nums[i]==candidate2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int val = n/3;
        count1=0;
        count2=0;
        for(int v: nums){
            if(v==candidate1) count1++;
            else if(v==candidate2) count2++;
        }
        if(count1>val) list.add(candidate1);
        if(count2>val) list.add(candidate2);
        if(count1<=val && count2<=val){
            list.add(-1);
        }
        return list;
    }
}
        
