package Util;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        return isDividedBy(year,4)  && !isDividedBy(year,100) || isDividedBy(year,400);
    }
    private static boolean isDividedBy(int divide,int divisor){
        return divide%divisor==0;
    }
}
