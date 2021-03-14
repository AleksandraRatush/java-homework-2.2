package ru.netology.ratush212;


public class BonusMilesService {

    private static final int RUBLES_FOR_ONE_MILE = 20;

    public int calculate(int price) {
        return price / RUBLES_FOR_ONE_MILE;
    }
}
