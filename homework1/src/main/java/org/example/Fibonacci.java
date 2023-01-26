package org.example;

public class Fibonacci {
    public int fibonacci(int K) {

        if(K <= 0) {
            System.out.println(0);
            return 0;
        }
        if(K == 1) {
            System.out.println(1);
            return 1;
        }
        if(K == 2) return 1;
        int f1 = 0, f2 = 1, i;
        System.out.print(f1 + " ");
        if (n < 1)
            return;

        for (i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(String.valueOf(K-1) + "+" + String.valueOf(K-1) + "=" + String.valueOf(i));
        return i;
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibonacci(10);
    }
}
