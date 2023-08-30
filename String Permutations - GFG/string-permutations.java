//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        return helper("",S);
    }
    public ArrayList<String> helper(String p, String up){
        ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i); 
            String s = p.substring(i);
            list.addAll(helper(f+ch+s, up.substring(1)));
        }
        Collections.sort(list);
        return list;
    }
}
