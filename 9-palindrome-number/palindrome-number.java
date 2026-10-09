class Solution {
    public boolean isPalindrome(int x) {
        int sum =0;
        int num = x; 
        if(x<0) {
            return false;
        }
        while(num != 0) {
            int r = num%10;
            if(sum > Integer.MAX_VALUE || (sum == Integer.MAX_VALUE && r>7)) {
                return false;
            }
            if(sum < Integer.MIN_VALUE || (sum == Integer.MIN_VALUE && r<-8)) {
                return false;
            }
            sum = sum*10 + r;
            num /= 10;
        }
        if(sum == x) {
            return true;
        } else {
            return false;
        }
    }
}