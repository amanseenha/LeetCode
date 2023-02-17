class Solution {

  public int reverse(int x) {
    int rev = 0, num = x;
    while (num != 0) {
      int rem = num % 10;
      if (rem > 0) {
        if (rev > (Integer.MAX_VALUE - rem) / 10 || rev < (Integer.MIN_VALUE + rem) / 10) 
        {
          return 0;
        }
      }
        else {
             if (rev > (Integer.MAX_VALUE + rem) / 10 || rev < (Integer.MIN_VALUE - rem) / 10) 
            {
                return 0;
            }
        }
      rev = rev * 10 + rem;
      num /= 10;
    }
    return rev;
  }
}
