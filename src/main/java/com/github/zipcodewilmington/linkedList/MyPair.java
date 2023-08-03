package com.github.zipcodewilmington.linkedList;

import java.util.Objects;

public class MyPair {

    private Integer value;
    private String Key;

    public MyPair(String key, Integer value) {
        this.Key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.Key = key;
    }

    public String getKey(){
        return Key;
    }

    public Integer getValue(){
        return value;
    }
    protected void setValue(Integer value){this.value = value;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(value, myPair.value);
    }
    
}
