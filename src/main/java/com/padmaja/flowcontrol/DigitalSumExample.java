package com.padmaja.flowcontrol;
import java.lang.String;

public class DigitalSumExample {
    public int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number>0) {
            int digit = number % 10;



                sum += digit;

                number /= 10;

            }
            return sum;
        }
    }


