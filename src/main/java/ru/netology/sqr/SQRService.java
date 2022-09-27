package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int min, int max) {
        int skore = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= min && i * i <= max) {
                skore = skore + 1;
            }

        }
        System.out.println("skore");
        return skore;
    }


}