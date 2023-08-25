 class Solution {
 	public boolean isInterleave(String s1, String s2, String s3) {
 		char[] arr1 = s1.toCharArray();
 		char[] arr2 = s2.toCharArray();
 		char[] arr3 = s3.toCharArray();
 		if(arr1.length + arr2.length != arr3.length) return false;
 		boolean[][] dp = new boolean[arr1.length + 1][arr2.length + 1];
 		dp[0][0] = true;
 		for(int i = 0; i < arr1.length; i++){
 			if(arr1[i] == arr3[i])
 				dp[i + 1][0] = dp[i][0];
 		}
 		for(int i = 0; i < arr2.length; i++){
 			if(arr2[i] == arr3[i])
 				dp[0][i + 1] = dp[0][i];
 		}
 		for(int i = 1; i <= arr1.length; i++){
 			for(int j = 1; j <= arr2.length; j++){
 				if(arr3[i + j - 1] == arr1[i - 1]){
 					dp[i][j] = dp[i - 1][j];
 				}
 				if(arr3[i + j - 1] == arr2[j - 1]){
 					dp[i][j] |= dp[i][j - 1];
 				}
 			}
 		}
 		return dp[arr1.length][arr2.length];
 	}
 }