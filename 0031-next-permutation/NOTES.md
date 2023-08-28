Intution:
1) Find the longest prefix (index where there is a break in monotonity);
1.1) go to 2 only if index != -1
1.2) else go to 3.
2) between that index and the last element find element just greater than el at index;
2.1)swap them
3) reverse the array from index +1 to len-1;