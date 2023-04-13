package org.example;

public class GeeksForGeeks{

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Function call
        System.out.println(FlippedCount(a, b));
    }

    // Function that count set bits
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    // Function that return count of
    // flipped number
    public static int FlippedCount(int a, int b)
    {
        // Return count of set bits in
        // a XOR b
        return countSetBits(a ^ b);
    }

    

}
