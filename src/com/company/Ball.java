package com.company;

import java.util.Objects;

public abstract class Ball implements Comparable<Ball>{
    private String ball;
    private int size;



    public Ball(int size, String ball) {
        this.ball = ball;
        this.size = size;
    }

    public boolean isTennisBall(){
        return false;
    }

    public String getBall() {
        return ball;
    }

    public int getSize() {
        return size;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public abstract String getExtractInfo();

    @Override
    public int compareTo(Ball o) {
        if(this.isTennisBall() && !o.isTennisBall()){
            return -1;
        } else{
            if(o.isTennisBall() && !this.isTennisBall()){
                return 1;

            } else{
                Integer ii = this.getSize();
                return ii.compareTo(o.getSize());
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball1 = (Ball) o;
        return size == ball1.size &&
                Objects.equals(ball, ball1.ball);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball, size);
    }
    @Override
    public String toString() {
        return "Ball{" +
                "ball='" + ball + '\'' +
                ", size=" + size + '\'' + getExtractInfo() +
                '}';
    }
}
