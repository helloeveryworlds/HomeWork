package org.example;

public class LeapYear {
    // Java program to check
    // for a leap year


    static boolean checkYear(int year)
    {
        if (year % 400 == 0)
            return true;

        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;
    }

    // Driver method
    public static void main(String[] args)
    {
        int year = 2000;
        System.out.println( checkYear(2000)? "Leap Year" :
                    "Not a Leap Year" );
        year = 1999;
        System.out.println( checkYear(1999)? "Leap Year" :
                "Not a Leap Year" );
        year = 2004;
        System.out.println( checkYear(2004)? "Leap Year" :
                "Not a Leap Year" );
    }


}
