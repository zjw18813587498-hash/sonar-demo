package com.example;

public class BuggyClass {
    public String getName() {
        String name = null;
        return name.length();  // 这里会有 NullPointerException bug
    }
}
