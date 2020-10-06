package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static ArrayList<Ball> getBalls(){
        ArrayList<Ball> balls = new ArrayList<>();
        FootBall fb = new FootBall(1, "Willson");
        balls.add(fb);
        balls.add(new FootBall(4, "Adidas"));
        balls.add(new FootBall(4, "Select"));
        balls.add(new FootBall(4, "Adidas"));
        balls.add(new FootBall(4, "Tretorn"));

        System.out.println(balls);

        var i = balls.indexOf(fb);
        System.out.println(i);

        FootBall fb2 = new FootBall(4, "Select");

        i = balls.indexOf(fb2);
        System.out.println(i);
        return balls;
    }

    public static void main(String[] args) {
        List<Ball> balls = getBalls();
//        System.out.println(balls);

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);
        ints.add(50);

        System.out.println(ints);

        int imin = Collections.min(ints);

        System.out.println(imin);

        var bmin = Collections.min(balls);

        int prim01 = 4, prim02 = 6;

        Integer a1 = prim01;

        int compar = a1.compareTo(prim02);

        System.out.println(compar);

        Ball fbf = Collections.min(balls);

        System.out.println("Mindste bold= " + fbf);
    }
}
