package com.company;

public class FootBall extends Ball{
    public FootBall(int size, String name){
        super(size, name);
    }

    @Override
    public String getExtractInfo() {
//        return this.getClass().getName();
        return "jeg er en Fodbold";
    }
}
