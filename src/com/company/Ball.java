package com.company;

public abstract class Ball {
    private String ball;
    private int size;

    public Ball( int size, String ball) {
        this.ball = ball;
        this.size = size;
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
    public String toString() {
        return "Ball{" +
                "ball='" + ball + '\'' +
                ", size=" + size + '\'' + getExtractInfo() +
                '}';
    }
}
