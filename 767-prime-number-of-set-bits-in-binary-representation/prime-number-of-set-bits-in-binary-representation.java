class Solution {
    public boolean checkPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
       
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int countPrime = 0;
        for(int i = left; i <= right; i++) {
            String binary = Integer.toBinaryString(i);
        
            int count1 = 0;
            for(int j=0; j<binary.length(); j++) {
                if(binary.charAt(j) == '1') {
                    count1++;
                }
            }
           
            if(checkPrime(count1)) {
                countPrime++;
            }
        }
        return countPrime;
    }
}