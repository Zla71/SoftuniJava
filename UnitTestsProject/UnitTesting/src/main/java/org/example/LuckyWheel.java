package org.example;

import java.util.Random;

public class LuckyWheel {
    private Random randomNumber;

    public LuckyWheel(Random randomNumber) {
        this.randomNumber = randomNumber;
    }


    // Ще тествам:
    // 1. Ако заложа 5 лева и получа 100                    - тогава печеля 500 лева
    // 2. Ако заложа 5 лева и получа 2                      - тогава печеля 10 лева
    // 3. Ако заложа 5 лева и получа различно от 2 и 100    - тогава печеля 4 лева
    public int riskAndWin(int leva) {

        int luckyNumber = randomNumber.nextInt();

        if (luckyNumber == 100) {
            return leva * 100;
        } else if (luckyNumber == 2) {
            return leva * 2;
        } else {
            return leva - 1;
        }

    }
}
