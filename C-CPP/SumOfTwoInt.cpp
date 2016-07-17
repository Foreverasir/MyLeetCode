/*
2016-7-17

371. Sum of Two Integers
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3
*/

class Solution {
public:
    int getSum(int a, int b) {
        if(b == 0)
            return a;
        int myxor = a ^ b;
        int myand = (a & b) << 1;
        return getSum(myxor,myand);
    }
};
