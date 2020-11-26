package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Interger min value =" + myMinIntValue);
        System.out.println("Interger Max Value = " + myMaxIntValue);
        System.out.println("Busted" + (myMaxIntValue + 1) ) ;
        System.out.println("Busted" + (myMinIntValue -1) ) ;
        int myMacIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("myMinByteValue =" + myMinByteValue);
        System.out.println("myMaxByteValue= " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min value = " + myMinShortValue);
        System.out.println("short max value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);

        long bigLong = 2_121_544_555L;
        System.out.println(bigLong);

        short bigShort = 32767;
        int total = (myMinIntValue / 2);
        byte myBewByteValue = (byte)(myMinByteValue / 2);

    }
}
