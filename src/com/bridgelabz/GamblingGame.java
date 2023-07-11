package com.bridgelabz;

import java.util.Random;

public class GamblingGame {
    public static int stakeOfEveryDay = 100;
    public static final int betEveryGame = 1;
    public static final int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
    }

    public static void playGame() {
        Random random=new Random();
        int bit=random.nextInt(2);
        if (bit == win) {
            System.out.println("You are win");
            stakeOfEveryDay++;
        } else {
            System.out.println("You are Loss");
            stakeOfEveryDay--;
        }
        System.out.println("Now your stake is " + stakeOfEveryDay);
    }
}
