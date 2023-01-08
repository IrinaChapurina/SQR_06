package ru.netology.sqr;
public class SQRService {
    public int calculateSqrt (int initialNumber, int finishNumber) {
        int counterSqrt = 0;
        for (int i = 10; i <= 99; i++) {
            int i2 = i * i;
            if (i2 >= initialNumber) {
                if (i2 <= finishNumber){
                    counterSqrt = counterSqrt + 1;
                }
            }
        }
        return counterSqrt;
    }
}
