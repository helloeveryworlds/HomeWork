package org.example;
//3.Write a program that prints a multiplication table for numbers up to 12.
public class MultipleTable {
    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++){
            for(int j = 0; j <= 12; j++){
                System.out.print(String.valueOf(i)+'*'+String.valueOf(j)+'='+String.valueOf(i*j));
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
