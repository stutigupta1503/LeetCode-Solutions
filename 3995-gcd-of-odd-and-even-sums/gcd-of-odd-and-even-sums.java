class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i <= 2*n ; i+=2) {
            sumOdd += i;
        }
        for(int j = 2; j <= 2*n ; j+=2) {
            sumEven += j;
        }
        // Calculate GCD
        while(sumEven > 0 && sumOdd > 0) {
            if(sumEven > sumOdd) {
                sumEven %= sumOdd;
            } else {
                sumOdd %= sumEven;
            }
        }
        if(sumEven == 0) {
            return sumOdd;
        } else {
            return sumEven;
        }
    }
}