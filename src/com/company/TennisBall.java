package com.company;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class TennisBall extends Ball {

    public TennisBall(int size, String name){
        super(size, name);

    }

    @Override
    public boolean isTennisBall() {
        if(getSize() > 10){
            return false;
        }
        return true;
    }

    @Override
    public String getExtractInfo() {
        return "Jeg er en Tennisbold";
    }
}
