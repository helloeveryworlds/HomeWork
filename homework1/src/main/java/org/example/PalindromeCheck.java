package org.example;
//4.Write a function that tests whether a string is a palindrome and test it in your program.
// assume the input is a string.
public class PalindromeCheck {
    public boolean palidromeCheck(String str){
        if(str == null || str.length() == 0){
            return true;//assume the null or empty is also palindrome
        }
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String testCase1 = "abba";
        String testCase2 = "";
        String testCase3 = "abcba";
        String testCase4 = "aacabb";
        PalindromeCheck test = new PalindromeCheck();
        boolean res = test.palidromeCheck(testCase1);
        System.out.println("The res of test case 1 is: " + res);
        res = test.palidromeCheck(testCase2);
        System.out.println("The res of test case 2 is: " + res);
        res = test.palidromeCheck(testCase3);
        System.out.println("The res of test case 3 is: " + res);
        res = test.palidromeCheck(testCase4);
        System.out.println("The res of test case 4 is: " + res);
    }
}
