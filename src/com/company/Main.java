package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        FootBall fb = new FootBall(1, "Willson");
        balls.add(fb);
        balls.add(new FootBall(4, "Adidas"));
        balls.add(new FootBall(4, "Select"));
        balls.add(new FootBall(4, "Adidas"));
        balls.add(new FootBall(4, "Tretorn"));

        System.out.println(balls);
    }
}
