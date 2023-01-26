package org.example;

public class Fibonacci {
    public void fibonacci(int K) {

        if(K <= 0) {
            System.out.println(0);
        }
        if(K == 1) {
            System.out.println(1);
        }
        if(K == 2) {
            System.out.println(1);
        }
        float f1 = 1, f2 = 1, i;

        for (i = 3; i < K; i++) {
            float next = f1 + f2;
            System.out.println(String.valueOf(f1) + "+" + String.valueOf(f2) + "=" + String.valueOf(next));
            f1 = f2;
            f2 = next;
        }
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibonacci(100);
    }
}
